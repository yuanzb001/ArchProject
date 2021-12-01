import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;

public class Instructions {

    private HashMap<Integer, Integer> memory;
    private MainPanel mainPanel;
    private Util m_util;
    private int memoryStart = 10;
    private int inputCount = 0;
    private int base = 10; // starting memory location
    private boolean program1 = false;

    Instructions(){
        mainPanel = new MainPanel();
        m_util = new Util();
        JFrame frame = new JFrame("MainPanel");
        frame.setContentPane(mainPanel.MainWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        mainPanel.runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = mainPanel.commandText.getText();
                if(value.length() == 16) {
                    HashMap<String, Integer> realValue = m_util.decodeData(value);
                    int realAddress = realValue.get("address") + realValue.get("ix");
                    if(realAddress < memoryStart){
                        mainPanel.setWarmingLabel("The address " + Integer.toString(realAddress)+ " is reserved address");
                        int[] data = new int[]{0,0,0,1};
                        mainPanel.setMFR(data);
                    }else {
                        switch (realValue.get("opCode")) {
                            case 1: {
                                if (!memory.containsKey(realAddress)) {
                                    mainPanel.setWarmingLabel("The address " + Integer.toString(realAddress) + " has no value");
                                } else {
                                    loadRegfromMem(realAddress, realValue.get("register"));
                                }
                                break;
                            }
                            case 2: {
                                storeRegtoMem(realAddress, mainPanel.getRegValue(realValue.get("register")));  //where is the value show or get
                                break;
                            }
                            case 3: {
                                if (!memory.containsKey(realAddress)) {
                                    mainPanel.setWarmingLabel("");
                                } else {
                                    loadReWithAddr(realAddress, realValue.get("register"));
                                }
                                break;
                            }
                            case 4: {                      //Store Instructions into Memory
                                AddMemoryToRegister(realAddress, realValue.get("register"));
                                break;
                            }
                            case 5: {
                                SubMemoryFromRegister(realAddress, realValue.get("register"));  //Function to Subtract EA from Register Value
                                //where is the value show or get
                                break;
                            }
                            case 6: {
                                int immediate = realValue.get("address");
                                if (immediate!=0)
                                {
                                    //add value to register if and only if immediate address has a value
                                    AddImmToRegister(immediate, realValue.get("register"));
                                }

                                break;
                            }
                            case 7: {
                                int immediate = realValue.get("address");
                                if(immediate!=0)
                                {
                                    //subtract value from register if and only if immediate address has a value
                                    SubImmFromRegister(immediate, realValue.get("register"));
                                }
                                break;
                            }
                            case 10:{
                                jumpZero(realAddress,realValue.get("register"));
                                break;
                            }
                            case 11:{
                                jumpNotZero(realAddress,realValue.get("register"));
                                break;
                            }
                            case 12:{
                                jumpConditionCode(realAddress,realValue.get("register"));
                                break;
                            }
                            case 13:{
                                jumpUncondition(realAddress);
                                break;
                            }
                            case 14:{
                                jumpAndReturn(realAddress);
                                break;
                            }
                            case 15:{
                                returnFromSub(realValue.get("address"));
                                break;
                            }
                            case 16:{
                                subOneAndBranch(realValue.get("register"), realAddress);
                                break;
                            }
                            case 17:{
                                jumpGreaterOrEqual(realAddress, realValue.get("address"));
                                break;
                            }
                            case 20:{
                                MultiplyRegbyRegister(realValue.get("rx"),realValue.get("ry"));
                            }

                            case 21:{
                                DivideRegbyRegister(realValue.get("rx"), realValue.get("ry"));
                            }
                            case 22:{
                                TestEqualityofRegister(realValue.get("rx"), realValue.get("ry"));
                            }

                            case 23:{
                                AndofRegister(realValue.get("rx"), realValue.get("ry"));
                            }

                            case 24:{
                                ORofRegister(realValue.get("rx"), realValue.get("ry"));
                            }

                            case 25:{
                                NOTofRegister(realValue.get("rx"));
                            }
                            case 31:{
                                shiftRegisterByCount(realValue.get("Count"), realValue.get("register"), realValue.get("AL"), realValue.get("LR"));
                            }
                            case 32:{
                                rotateRegisterByCount(realValue.get("Count"), realValue.get("register"), realValue.get("AL"), realValue.get("LR"));
                            }
                            case 41: {
                                if (!memory.containsKey(realAddress)) {
                                    mainPanel.setWarmingLabel("");
                                } else {
                                    loadIRfromMem(realAddress, realValue.get("register"));
                                }
                                break;
                            }
                            case 42: {
                                storeIRtoMem(realAddress, mainPanel.getIRegValue(realValue.get("register")));  //where is the value show or get
                                break;
                            }
                            case 61:{
                                // create devid to record the device id and store it as an argument in function
                                inputValue(realValue.get("register"),realValue.get("devid"));

                            }

                            case 62:{
                                // create devid to record the device id and store it as an argument in function
                                outputValue(realValue.get("register"),realValue.get("devid"));

                            }
                        }
                    }
                }else{
                    mainPanel.setWarmingLabel("Invalid Input");
                }
            }
        });

        mainPanel.consoleText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if(e.getKeyChar() == '\n'){
                    if(program1) {
                        inputCount++;
                        inputValue(0, 0);
                        if (inputCount == 20) {
                            storeRegtoMem(base, mainPanel.getRegValue(0));
                            mainPanel.consoleText.setText("Please insert number to search:\n");
                        } else if (inputCount == 21) {
                            inputCount = 0;
                            //Search_20_Numbers(0);
                            program1 = false;
                        } else {
                            storeRegtoMem(base, mainPanel.getRegValue(0));
                            base ++;
                        }
                    }
                }
            }
        });

        mainPanel.testProgram1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.consoleText.setText("Test programme 1 starts:\n");
                program1 = true;
            }
        });
    }



    void loadRegfromMem(int address, int index){
        int value = memory.get(address);
        mainPanel.setWarmingLabel("The address " + Integer.toString(address) + " is " + Integer.toString(value));
        String temp = Integer.toBinaryString(value);
        int[] data = new int[16];
        for(int i = 0; i < 16; i++){
            if(i < (16 - temp.length())){
                data[i] = 0;
            }else {
                data[i] = Integer.parseInt(String.valueOf(temp.charAt(i - (16 - temp.length()))));
            }
        }
        mainPanel.setGPRData(index, data);
    }

    void storeRegtoMem(int address, int value){
        mainPanel.setWarmingLabel("The address " + Integer.toString(address) + " is " + Integer.toString(value));
        memory.put(address, value);
    }

    void loadReWithAddr(int address, int index){
        mainPanel.setWarmingLabel("The address is " +  Integer.toString(address));
        String temp = Integer.toBinaryString(address);
        int[] data = new int[16];
        for(int i = 0; i < 16; i++){
            if(i < (16 - temp.length())){
                data[i] = 0;
            }else {
                data[i] = Integer.parseInt(String.valueOf(temp.charAt(i - (16 - temp.length()))));
            }
        }
        mainPanel.setGPRData(index -1, data);
    }

    void AddMemoryToRegister(int real_address, int index){
        // Function adds memory to register selected
        int regvalue = mainPanel.getRegValue(index);
        int AMR_Value = real_address + regvalue;
        int[] AMR_ARR = m_util.intToBin(AMR_Value,16);
        mainPanel.setGPRData(index, AMR_ARR);
    }

    void SubMemoryFromRegister(int real_address, int index){
        int regvalue = mainPanel.getRegValue(index); // find the value of the register
        //function subtracts memory from register selected
        int SMR_Value = regvalue -  real_address;
        int[] SMR_ARR = m_util.intToBin(SMR_Value,16); // create the resulting register value to a binary
        mainPanel.setGPRData(index, SMR_ARR);
    }

    void AddImmToRegister(int imm, int index){
        int regvalue = mainPanel.getRegValue(index); // find the value of the register
        // Function adds immediate to register selected
        int AIR_Value = regvalue + imm;
        int[] AIR_ARR = m_util.intToBin(AIR_Value,16); // create the resulting register value to a binary
        mainPanel.setGPRData(index, AIR_ARR);
    }

    void SubImmFromRegister(int imm, int index){
        int regvalue = mainPanel.getRegValue(index); // find the value of the register
        //function subtracts immediate from register selected
        int SIR_Value = regvalue -  imm;
        int[] SIR_ARR = m_util.intToBin(SIR_Value,16); // create the resulting register value to a binary
        mainPanel.setGPRData(index, SIR_ARR);
    }

    void jumpZero(int address, int register){
        int pc = m_util.binToInt(mainPanel.getPCValue());
        if(mainPanel.getRegValue(register) == 0){
            mainPanel.setPCData(m_util.intToBin(address,12));
        }else{
            mainPanel.setPCData(m_util.intToBin(pc + 1, 12));
        }
    }

    void jumpNotZero(int address, int register){
        int pc = m_util.binToInt(mainPanel.getPCValue());
        if(mainPanel.getRegValue(register) != 0){
            mainPanel.setPCData(m_util.intToBin(address,12));
        }else{
            mainPanel.setPCData(m_util.intToBin(pc + 1, 12));
        }
    }

    void jumpConditionCode(int address, int cc){
        int pc = m_util.binToInt(mainPanel.getPCValue());
        if(cc < 2){
            mainPanel.setPCData(m_util.intToBin(address,12));
        }else{
            mainPanel.setPCData(m_util.intToBin(pc + 1, 12));
        }
    }

    void jumpUncondition(int address){
        mainPanel.setPCData(m_util.intToBin(address,12));
    }

    void jumpAndReturn(int address){
        int pc = m_util.binToInt(mainPanel.getPCValue());
        mainPanel.setGPRData(3, m_util.intToBin(pc + 1, 16));
        mainPanel.setPCData(m_util.intToBin(address, 12));
    }

    void returnFromSub(int immed){
        mainPanel.setGPRData(0, m_util.intToBin(immed, 16));
        mainPanel.setPCData(m_util.intToBin(mainPanel.getRegValue(3), 12));
    }

    void subOneAndBranch(int r, int address){
        if(mainPanel.getRegValue(r) != 0){
            mainPanel.setGPRData(r,m_util.intToBin(mainPanel.getRegValue(r) - 1, 16));
        }
        if(mainPanel.getRegValue(r) > 0){
            mainPanel.setPCData(m_util.intToBin(address, 12));
        }else{
            mainPanel.setPCData(m_util.intToBin(m_util.binToInt(mainPanel.getPCValue()) + 1, 12));
        }
    }

    void jumpGreaterOrEqual(int address, int r){
        if(mainPanel.getRegValue(r) >= 0){
            mainPanel.setPCData(m_util.intToBin(address, 12));
        }
        else{
            mainPanel.setPCData(m_util.intToBin(m_util.binToInt(mainPanel.getPCValue()) + 1, 12));
        }
    }

    void MultiplyRegbyRegister(int rx, int ry){

        if (ry!=1||ry!=3)
        {
            if (rx!=1||rx!=3)
            {
                int value_mult = mainPanel.getRegValue(rx) * mainPanel.getRegValue(ry);
                int[] answer = m_util.intToBin(value_mult,32);
                int[] highOrder = new int[16];
                int[] lowOrder = new int[16];
                for(int i = 0; i < 16; i++){
                    highOrder[i] = answer[i];
                    lowOrder[i] = answer[16+i];
                }
                mainPanel.setGPRData(rx,highOrder);
                mainPanel.setGPRData(ry+1, lowOrder);
            }
        }
    }

    void DivideRegbyRegister(int rx, int ry){
        if (ry!=1||ry!=3)
        {
            if (rx!=1||rx!=3)
            {
                if(mainPanel.getRegValue(ry) == 0){
                    mainPanel.setWarmingLabel("DIVZERO");
                }else {
                    int value_avg = mainPanel.getRegValue(rx) / mainPanel.getRegValue(ry);
                    int[] answer = m_util.intToBin(value_avg, 32);
                    int[] highOrder = new int[16];
                    int[] lowOrder = new int[16];
                    for(int i = 0; i < 16; i++){
                        highOrder[i] = answer[i];
                        lowOrder[i] = answer[16+i];
                    }
                    mainPanel.setGPRData(rx, highOrder);
                    mainPanel.setGPRData(ry, lowOrder);
                }
            }
        }
    }

    void TestEqualityofRegister (int rx, int ry){
        if(mainPanel.getRegValue(rx) == mainPanel.getRegValue(ry)){
            mainPanel.setGPRData(3, m_util.intToBin(1,16));
        }else{
            mainPanel.setGPRData(3, m_util.intToBin(0,16));
        }

    }

    void AndofRegister(int rx, int ry){
        int[] xValue = m_util.intToBin(mainPanel.getRegValue(rx),16);
        int[] yValue = m_util.intToBin(mainPanel.getRegValue(ry),16);
        int[] res = new int[16];
        for(int i = 0; i < 16; i++){
            if(xValue[i] == 1 && yValue[i] == 1){
                res[i] = 1;
            }else{
                res[i] = 0;
            }
        }
        mainPanel.setGPRData(rx, res);
    }

    void ORofRegister(int rx, int ry){
        int[] xValue = m_util.intToBin(mainPanel.getRegValue(rx),16);
        int[] yValue = m_util.intToBin(mainPanel.getRegValue(ry),16);
        int[] res = new int[16];
        for(int i = 0; i < 16; i++){
            if(xValue[i] == 0 && yValue[i] == 0){
                res[i] = 0;
            }else{
                res[i] = 1;
            }
        }
        mainPanel.setGPRData(rx, res);
    }

    void NOTofRegister(int rx){
        int[] xValue = m_util.intToBin(mainPanel.getRegValue(rx),16);
        int[] res = new int[16];
        for(int i = 0; i < 16; i++){
            if(xValue[i] == 0 ){
                res[i] = 1;
            }else{
                res[i] = 0;
            }
        }
        mainPanel.setGPRData(rx, res);
    }

    void shiftRegisterByCount(int count, int index, int AL, int RL){
        int[] rValue = m_util.intToBin(mainPanel.getRegValue(index), 16);
        int[] re = new int[16];
        for (int i = 0; i < 16; i++){
            if(AL == 1){
                if (RL == 1){
                    if((i - count) < 0){
                        re[i - count + 16] = rValue[i];
                    }else{
                        re[i - count] = rValue[i];
                    }
                }else{
                    if((i + count) >= 16){
                        re[i + count - 16] = rValue[i];
                    }else{
                        re[i + count] = rValue[i];
                    }
                }
            }else{
                if(i == 0){
                    re[i] = rValue[i];
                }else{
                    if (RL == 1){
                        if((i - count) < 0){
                            re[i - count + 15] = rValue[i];
                        }else{
                            re[i - count] = rValue[i];
                        }
                    }else{
                        if((i + count) >= 15){
                            re[i + count - 15] = rValue[i];
                        }else{
                            re[i + count] = rValue[i];
                        }
                    }
                }
            }
        }
        mainPanel.setGPRData(index, re);
    }

    void rotateRegisterByCount(int count, int index, int AL, int RL){
        int[] rValue = m_util.intToBin(mainPanel.getRegValue(index), 16);
        int[] re = new int[16];
        for (int i = 0; i < 16; i++){
            if(AL == 1){
                if (RL == 1){
                    if((i - count) < 0){
                        re[i - count + 16] = rValue[i];
                    }else{
                        re[i - count] = rValue[i];
                    }
                }else{
                    if((i + count) >= 16){
                        re[i + count - 16] = rValue[i];
                    }else{
                        re[i + count] = rValue[i];
                    }
                }
            }else{
                if(i == 0){
                    re[i] = rValue[i];
                }else{
                    if (RL == 1){
                        if((i - count) < 0){
                            re[i - count + 15] = rValue[i];
                        }else{
                            re[i - count] = rValue[i];
                        }
                    }else{
                        if((i + count) >= 15){
                            re[i + count - 15] = rValue[i];
                        }else{
                            re[i + count] = rValue[i];
                        }
                    }
                }
            }
        }
        mainPanel.setGPRData(index, re);
    }

    void loadIRfromMem(int address, int index){
        int value = memory.get(address);
        mainPanel.setWarmingLabel("The address " + Integer.toString(address) + " is " + Integer.toString(value));
        String temp = Integer.toBinaryString(value);
        int[] data = new int[16];
        for(int i = 0; i < 16; i++){
            if(i < (16 - temp.length())){
                data[i] = 0;
            }else {
                data[i] = Integer.parseInt(String.valueOf(temp.charAt(i - (16 - temp.length()))));
            }
        }
        mainPanel.setIXRData(index -1, data);
    }

    void storeIRtoMem(int address, int value){
        memory.put(address, value);
        mainPanel.setWarmingLabel("The address " + Integer.toString(address) + " is " + Integer.toString(value));
    }

    void inputValue(int index, int device_id){

        String charValue;
        int chartest;

        //defining character to get value from action listener
        if(device_id==0)
        {
            String device = "Console Keyboard";

            // Zhuobin you would need to edit this
            charValue = mainPanel.consoleText.getText();

            String[] tmp = charValue.split(String.valueOf('\n'));
            chartest = Integer.parseInt(tmp[tmp.length-1],10);

            int[] Char_ARR = m_util.intToBin(chartest,16); // create the resulting register value to a binary
            mainPanel.setGPRData(index, Char_ARR);
        }else if(device_id==2)
        {
            String device = "Card Reader";

            charValue = mainPanel.consoleText.getText();

            chartest = Integer.parseInt(charValue,10);

            int[] Char_ARR = m_util.intToBin(chartest,16); // create the resulting register value to a binary
            mainPanel.setGPRData(index, Char_ARR);

        }else
        {
            System.out.println("Enter Proper Value For Input");
        }

    }

    void outputValue(int index, int device_id){

        if(device_id==1)
        {
            String device = "Console Printer";

            int charValue = mainPanel.getRegValue(index);

            mainPanel.consoleText.setText(Integer.toString(charValue));
//            if(charValue>=0 && charValue<=127) //checking for ASCII value
//            {
//                // Zhuobin you would need to edit this
//                consoleText.setText(Integer.toString(charValue));
//            }
//            else
//            {
//                System.out.println("This is not a character");
//            }

        }else
        {
            System.out.println("Enter Proper Value For Output");
        }
    }

    public static void main(String[] args) {
        Instructions instruct = new Instructions();
    }
}
