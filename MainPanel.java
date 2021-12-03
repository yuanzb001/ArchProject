import org.w3c.dom.DOMStringList;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainPanel {
    private Util m_util = new Util();
    private HashMap<Integer, Integer> memory;
    private int memoryStart = 10;
    private int usefulStart = 10;

    private int register0 = 0 ;
    private int register1 = 0 ;
    private int register2 = 0 ;
    private int register3 = 0 ;

    private int indexRegister1 = 0;
    private int indexRegister2 = 0;
    private int indexRegister3 = 0;

    private JRadioButton gpr0_rb1;
    private JRadioButton gpr0_rb2;
    private JRadioButton gpr0_rb3;
    private JRadioButton gpr0_rb4;
    private JRadioButton gpr0_rb5;
    private JRadioButton gpr0_rb6;
    private JRadioButton gpr0_rb7;
    private JRadioButton gpr0_rb8;
    private JRadioButton gpr0_rb9;
    private JRadioButton gpr0_rb10;
    private JRadioButton gpr0_rb11;
    private JRadioButton gpr0_rb12;
    private JRadioButton gpr0_rb13;
    private JRadioButton gpr0_rb14;
    private JRadioButton gpr0_rb15;
    private JRadioButton gpr0_rb16;
    private JLabel gpr0_label3;
    private JLabel gpr0_label2;
    private JLabel gpr0_label1;
    private JLabel gpr0_label4;
    private JLabel gpr0_label5;
    private JLabel gpr0_label6;
    private JLabel gpr0_label7;
    private JLabel gpr0_label8;
    private JLabel gpr0_label9;
    private JLabel gpr0_label10;
    private JLabel gpr0_label11;
    private JLabel gpr0_label12;
    private JLabel gpr0_label13;
    private JLabel gpr0_label14;
    private JLabel gpr0_label15;
    private JLabel gpr0_label16;
    private JRadioButton gpr1_rb1;
    private JRadioButton gpr1_rb2;
    private JRadioButton gpr1_rb3;
    private JRadioButton gpr1_rb4;
    private JRadioButton gpr1_rb5;
    private JRadioButton gpr1_rb6;
    private JRadioButton gpr1_rb7;
    private JRadioButton gpr1_rb8;
    private JRadioButton gpr1_rb9;
    private JRadioButton gpr1_rb10;
    private JRadioButton gpr1_rb11;
    private JRadioButton gpr1_rb12;
    private JRadioButton gpr1_rb13;
    private JRadioButton gpr1_rb14;
    private JRadioButton gpr1_rb15;
    private JRadioButton gpr1_rb16;
    private JLabel gpr1_label1;
    private JLabel gpr1_label2;
    private JLabel gpr1_label3;
    private JLabel gpr1_label4;
    private JLabel gpr1_label5;
    private JLabel gpr1_label6;
    private JLabel gpr1_label7;
    private JLabel gpr1_label8;
    private JLabel gpr1_label9;
    private JLabel gpr1_label10;
    private JLabel gpr1_label11;
    private JLabel gpr1_label12;
    private JLabel gpr1_label13;
    private JLabel gpr1_label14;
    private JLabel gpr1_label15;
    private JLabel gpr1_label16;
    private JRadioButton gpr2_rb1;
    private JRadioButton gpr2_rb2;
    private JRadioButton gpr2_rb3;
    private JRadioButton gpr2_rb4;
    private JRadioButton gpr2_rb5;
    private JRadioButton gpr2_rb6;
    private JRadioButton gpr2_rb7;
    private JRadioButton gpr2_rb8;
    private JRadioButton gpr2_rb9;
    private JRadioButton gpr2_rb10;
    private JRadioButton gpr2_rb11;
    private JRadioButton gpr2_rb12;
    private JRadioButton gpr2_rb13;
    private JRadioButton gpr2_rb14;
    private JRadioButton gpr2_rb15;
    private JRadioButton gpr2_rb16;
    private JLabel gpr2_label1;
    private JLabel gpr2_label2;
    private JLabel gpr2_label3;
    private JLabel gpr2_label4;
    private JLabel gpr2_label5;
    private JLabel gpr2_label6;
    private JLabel gpr2_label7;
    private JLabel gpr2_label8;
    private JLabel gpr2_label9;
    private JLabel gpr2_label10;
    private JLabel gpr2_label11;
    private JLabel gpr2_label12;
    private JLabel gpr2_label13;
    private JLabel gpr2_label14;
    private JLabel gpr2_label15;
    private JLabel gpr2_label16;
    private JRadioButton gpr3_rb1;
    private JRadioButton gpr3_rb2;
    private JRadioButton gpr3_rb3;
    private JRadioButton gpr3_rb4;
    private JRadioButton gpr3_rb5;
    private JRadioButton gpr3_rb6;
    private JRadioButton gpr3_rb7;
    private JRadioButton gpr3_rb8;
    private JRadioButton gpr3_rb9;
    private JRadioButton gpr3_rb10;
    private JRadioButton gpr3_rb11;
    private JRadioButton gpr3_rb12;
    private JRadioButton gpr3_rb13;
    private JRadioButton gpr3_rb14;
    private JRadioButton gpr3_rb15;
    private JRadioButton gpr3_rb16;
    private JLabel gpr3_label1;
    private JLabel gpr3_label2;
    private JLabel gpr3_label3;
    private JLabel gpr3_label4;
    private JLabel gpr3_label5;
    private JLabel gpr3_label6;
    private JLabel gpr3_label7;
    private JLabel gpr3_label8;
    private JLabel gpr3_label9;
    private JLabel gpr3_label10;
    private JLabel gpr3_label11;
    private JLabel gpr3_label12;
    private JLabel gpr3_label13;
    private JLabel gpr3_label14;
    private JLabel gpr3_label15;
    private JLabel gpr3_label16;
    private JRadioButton ixr1_rb1;
    private JRadioButton ixr1_rb2;
    private JRadioButton ixr1_rb3;
    private JRadioButton ixr1_rb4;
    private JRadioButton ixr1_rb5;
    private JRadioButton ixr1_rb6;
    private JRadioButton ixr1_rb7;
    private JRadioButton ixr1_rb8;
    private JRadioButton ixr1_rb9;
    private JRadioButton ixr1_rb10;
    private JRadioButton ixr1_rb11;
    private JRadioButton ixr1_rb12;
    private JRadioButton ixr1_rb13;
    private JRadioButton ixr1_rb14;
    private JRadioButton ixr1_rb15;
    private JRadioButton ixr1_rb16;
    private JLabel ixr1_label1;
    private JLabel ixr1_label2;
    private JLabel ixr1_label3;
    private JLabel ixr1_label4;
    private JLabel ixr1_label5;
    private JLabel ixr1_label6;
    private JLabel ixr1_label7;
    private JLabel ixr1_label8;
    private JLabel ixr1_label9;
    private JLabel ixr1_label10;
    private JLabel ixr1_label11;
    private JLabel ixr1_label12;
    private JLabel ixr1_label13;
    private JLabel ixr1_label14;
    private JLabel ixr1_label15;
    private JLabel ixr1_label16;
    private JRadioButton ixr2_rb1;
    private JRadioButton ixr2_rb2;
    private JRadioButton ixr2_rb3;
    private JRadioButton ixr2_rb4;
    private JRadioButton ixr2_rb5;
    private JRadioButton ixr2_rb6;
    private JRadioButton ixr2_rb7;
    private JRadioButton ixr2_rb8;
    private JRadioButton ixr2_rb9;
    private JRadioButton ixr2_rb10;
    private JRadioButton ixr2_rb11;
    private JRadioButton ixr2_rb12;
    private JRadioButton ixr2_rb13;
    private JRadioButton ixr2_rb14;
    private JRadioButton ixr2_rb15;
    private JRadioButton ixr2_rb16;
    private JRadioButton ixr3_rb1;
    private JRadioButton ixr3_rb2;
    private JRadioButton ixr3_rb3;
    private JRadioButton ixr3_rb4;
    private JRadioButton ixr3_rb5;
    private JRadioButton ixr3_rb6;
    private JRadioButton ixr3_rb7;
    private JRadioButton ixr3_rb8;
    private JRadioButton ixr3_rb9;
    private JRadioButton ixr3_rb10;
    private JRadioButton ixr3_rb11;
    private JRadioButton ixr3_rb12;
    private JRadioButton ixr3_rb13;
    private JRadioButton ixr3_rb14;
    private JRadioButton ixr3_rb15;
    private JRadioButton ixr3_rb16;
    private JLabel ixr2_label1;
    private JLabel ixr2_label2;
    private JLabel ixr2_label3;
    private JLabel ixr2_label4;
    private JLabel ixr2_label5;
    private JLabel ixr2_label6;
    private JLabel ixr2_label7;
    private JLabel ixr2_label8;
    private JLabel ixr2_label9;
    private JLabel ixr2_label10;
    private JLabel ixr2_label11;
    private JLabel ixr2_label12;
    private JLabel ixr2_label13;
    private JLabel ixr2_label14;
    private JLabel ixr2_label15;
    private JLabel ixr2_label16;
    private JLabel ixr3_label1;
    private JLabel ixr3_label2;
    private JLabel ixr3_label3;
    private JLabel ixr3_label4;
    private JLabel ixr3_label5;
    private JLabel ixr3_label6;
    private JLabel ixr3_label7;
    private JLabel ixr3_label8;
    private JLabel ixr3_label9;
    private JLabel ixr3_label10;
    private JLabel ixr3_label11;
    private JLabel ixr3_label12;
    private JLabel ixr3_label13;
    private JLabel ixr3_label14;
    private JLabel ixr3_label15;
    private JLabel ixr3_label16;
    private JRadioButton pc_rb1;
    private JRadioButton pc_rb2;
    private JRadioButton pc_rb3;
    private JRadioButton pc_rb4;
    private JRadioButton pc_rb5;
    private JRadioButton pc_rb6;
    private JRadioButton pc_rb7;
    private JRadioButton pc_rb8;
    private JRadioButton pc_rb9;
    private JRadioButton pc_rb10;
    private JRadioButton pc_rb12;
    private JRadioButton pc_rb11;
    private JRadioButton mar_rb1;
    private JRadioButton mar_rb2;
    private JRadioButton mar_rb3;
    private JRadioButton mar_rb4;
    private JRadioButton mar_rb5;
    private JRadioButton mar_rb6;
    private JRadioButton mar_rb7;
    private JRadioButton mar_rb8;
    private JRadioButton mar_rb9;
    private JRadioButton mar_rb10;
    private JRadioButton mar_rb11;
    private JRadioButton mar_rb12;
    private JRadioButton mbr_rb1;
    private JRadioButton mbr_rb3;
    private JRadioButton mbr_rb4;
    private JRadioButton mbr_rb5;
    private JRadioButton mbr_rb6;
    private JRadioButton mbr_rb7;
    private JRadioButton mbr_rb8;
    private JRadioButton mbr_rb9;
    private JRadioButton mbr_rb10;
    private JRadioButton mbr_rb11;
    private JRadioButton mbr_rb12;
    private JRadioButton mbr_rb13;
    private JRadioButton mbr_rb14;
    private JRadioButton mbr_rb15;
    private JRadioButton mbr_rb16;
    private JRadioButton ir_rb1;
    private JRadioButton ir_rb2;
    private JRadioButton ir_rb3;
    private JRadioButton ir_rb4;
    private JRadioButton ir_rb5;
    private JRadioButton ir_rb6;
    private JRadioButton ir_rb7;
    private JRadioButton ir_rb8;
    private JRadioButton ir_rb9;
    private JRadioButton ir_rb10;
    private JRadioButton ir_rb11;
    private JRadioButton ir_rb12;
    private JRadioButton ir_rb13;
    private JRadioButton ir_rb14;
    private JRadioButton ir_rb15;
    private JRadioButton ir_rb16;
    private JRadioButton mfr_rb1;
    private JRadioButton mfr_rb2;
    private JRadioButton mfr_rb3;
    private JRadioButton mfr_rb4;
    private JRadioButton privileged_rb;
    private JButton gpr0_ld_Bu;
    private JButton gpr1_ld_Bu;
    private JButton gpr2_ld_Bu;
    private JButton gpr3_ld_Bu;
    private JButton ixr1_ld_Bu;
    private JButton ixr2_ld_Bu;
    private JButton ixr3_ld_Bu;
    private JButton pc_ld_Bu;
    private JButton mar_ld_Bu;
    private JButton mbr_ld_Bu;
    private JButton ir_ld_Bu;
    private JLabel pc_label1;
    private JLabel pc_label2;
    private JLabel pc_label3;
    private JLabel pc_label4;
    private JLabel pc_label5;
    private JLabel pc_label6;
    private JLabel pc_label7;
    private JLabel pc_label8;
    private JLabel pc_label9;
    private JLabel pc_label10;
    private JLabel pc_label11;
    private JLabel pc_label12;
    private JPanel gpr0;
    private JPanel gpr1;
    private JPanel gpr2;
    private JPanel gpr3;
    private JPanel ixr1;
    private JPanel ixr2;
    private JPanel ixr3;
    private JLabel mar_label1;
    private JLabel mar_label2;
    private JLabel mar_label3;
    private JLabel mar_label4;
    private JLabel mar_label5;
    private JLabel mar_label6;
    private JLabel mar_label7;
    private JLabel mar_label8;
    private JLabel mar_label9;
    private JLabel mar_label10;
    private JLabel mar_label11;
    private JLabel mar_label12;
    private JRadioButton mbr_rb2;
    private JLabel mbr_label1;
    private JLabel mbr_label2;
    private JLabel mbr_label3;
    private JLabel mbr_label4;
    private JLabel mbr_label5;
    private JLabel mbr_label6;
    private JLabel mbr_label7;
    private JLabel mbr_label8;
    private JLabel mbr_label9;
    private JLabel mbr_label10;
    private JLabel mbr_label11;
    private JLabel mbr_label12;
    private JLabel mbr_label13;
    private JLabel mbr_label14;
    private JLabel mbr_label15;
    private JLabel mbr_label16;
    private JLabel ir_label1;
    private JLabel ir_label2;
    private JLabel ir_label3;
    private JLabel ir_label4;
    private JLabel ir_label5;
    private JLabel ir_label6;
    private JLabel ir_label7;
    private JLabel ir_label8;
    private JLabel ir_label9;
    private JLabel ir_label10;
    private JLabel ir_label11;
    private JLabel ir_label12;
    private JLabel ir_label13;
    private JLabel ir_label14;
    private JLabel ir_label15;
    private JLabel ir_label16;
    private JPanel pc_panel;
    private JPanel mar_panel;
    private JPanel mbr_panel;
    private JPanel ir_panel;
    private JPanel mfr_panel;
    private JLabel mfr_label1;
    private JLabel mfr_label2;
    private JLabel mfr_label3;
    private JLabel mfr_label4;
    private JLabel privileged_label;
    private JPanel privileged_panel;
    private JPanel Register;
    private JPanel Unit;
    private JButton storeButton;
    private JButton IPLButton;
    private JButton loadButton;
    public JPanel MainWindow;
    private JPanel control_view;
    private JLabel gpr0_label;
    private JLabel gpr1_label;
    private JLabel gpr2_label;
    private JLabel gpr3_label;
    private JLabel ixr1_label;
    private JLabel ixr2_label;
    private JLabel ixr3_label;
    private JLabel pc_label;
    private JLabel mar_label;
    private JLabel mbr_label;
    private JLabel ir_label;
    private JLabel mfr_label;
    private JLabel pri_label;
    public JTextField commandText;
    private JLabel label_command;
    private JLabel WarmingLabel;
    public JButton runButton;
    public JTextPane consoleText;
    public JButton testProgram1Button;

    private ArrayList<JRadioButton> gpr0RadList = new ArrayList<JRadioButton>();
    private ArrayList<JLabel> gpr0LabelList = new ArrayList<JLabel>();
    private ArrayList<JRadioButton> gpr1RadList = new ArrayList<JRadioButton>();
    private ArrayList<JLabel> gpr1LabelList = new ArrayList<JLabel>();
    private ArrayList<JRadioButton> gpr2RadList = new ArrayList<JRadioButton>();
    private ArrayList<JLabel> gpr2LabelList = new ArrayList<JLabel>();
    private ArrayList<JRadioButton> gpr3RadList = new ArrayList<JRadioButton>();
    private ArrayList<JLabel> gpr3LabelList = new ArrayList<JLabel>();
    private ArrayList<JRadioButton> ixr1RadList = new ArrayList<JRadioButton>();
    private ArrayList<JLabel> ixr1LabelList = new ArrayList<JLabel>();
    private ArrayList<JRadioButton> ixr2RadList = new ArrayList<JRadioButton>();
    private ArrayList<JLabel> ixr2LabelList = new ArrayList<JLabel>();
    private ArrayList<JRadioButton> ixr3RadList = new ArrayList<JRadioButton>();
    private ArrayList<JLabel> ixr3LabelList = new ArrayList<JLabel>();

    private ArrayList<ArrayList<JRadioButton>> gprRadList = new ArrayList<ArrayList<JRadioButton>>();
    private ArrayList<ArrayList<JLabel>> gprLabelList = new ArrayList<ArrayList<JLabel>>();

    private ArrayList<ArrayList<JRadioButton>> ixrRadList = new ArrayList<ArrayList<JRadioButton>>();
    private ArrayList<ArrayList<JLabel>> ixrLabelList = new ArrayList<ArrayList<JLabel>>();

    private ArrayList<JRadioButton> pcRadList = new ArrayList<JRadioButton>();
    private ArrayList<JLabel> pcLabelList = new ArrayList<JLabel>();

    private ArrayList<JRadioButton> marRadList = new ArrayList<JRadioButton>();
    private ArrayList<JLabel> marLabelList = new ArrayList<JLabel>();

    private ArrayList<JRadioButton> mbrRadList = new ArrayList<JRadioButton>();
    private ArrayList<JLabel> mbrLabelList = new ArrayList<JLabel>();

    private ArrayList<JRadioButton> irRadList = new ArrayList<JRadioButton>();
    private ArrayList<JLabel> irLabelList = new ArrayList<JLabel>();


    MainPanel(){
        memory = new HashMap<Integer,Integer>();

        gpr0RadList.add(gpr0_rb1);
        gpr0RadList.add(gpr0_rb2);
        gpr0RadList.add(gpr0_rb3);
        gpr0RadList.add(gpr0_rb4);
        gpr0RadList.add(gpr0_rb5);
        gpr0RadList.add(gpr0_rb6);
        gpr0RadList.add(gpr0_rb7);
        gpr0RadList.add(gpr0_rb8);
        gpr0RadList.add(gpr0_rb9);
        gpr0RadList.add(gpr0_rb10);
        gpr0RadList.add(gpr0_rb11);
        gpr0RadList.add(gpr0_rb12);
        gpr0RadList.add(gpr0_rb13);
        gpr0RadList.add(gpr0_rb14);
        gpr0RadList.add(gpr0_rb15);
        gpr0RadList.add(gpr0_rb16);

        gpr0LabelList.add(gpr0_label1);
        gpr0LabelList.add(gpr0_label2);
        gpr0LabelList.add(gpr0_label3);
        gpr0LabelList.add(gpr0_label4);
        gpr0LabelList.add(gpr0_label5);
        gpr0LabelList.add(gpr0_label6);
        gpr0LabelList.add(gpr0_label7);
        gpr0LabelList.add(gpr0_label8);
        gpr0LabelList.add(gpr0_label9);
        gpr0LabelList.add(gpr0_label10);
        gpr0LabelList.add(gpr0_label11);
        gpr0LabelList.add(gpr0_label12);
        gpr0LabelList.add(gpr0_label13);
        gpr0LabelList.add(gpr0_label14);
        gpr0LabelList.add(gpr0_label15);
        gpr0LabelList.add(gpr0_label16);

        gpr1RadList.add(gpr1_rb1);
        gpr1RadList.add(gpr1_rb2);
        gpr1RadList.add(gpr1_rb3);
        gpr1RadList.add(gpr1_rb4);
        gpr1RadList.add(gpr1_rb5);
        gpr1RadList.add(gpr1_rb6);
        gpr1RadList.add(gpr1_rb7);
        gpr1RadList.add(gpr1_rb8);
        gpr1RadList.add(gpr1_rb9);
        gpr1RadList.add(gpr1_rb10);
        gpr1RadList.add(gpr1_rb11);
        gpr1RadList.add(gpr1_rb12);
        gpr1RadList.add(gpr1_rb13);
        gpr1RadList.add(gpr1_rb14);
        gpr1RadList.add(gpr1_rb15);
        gpr1RadList.add(gpr1_rb16);

        gpr1LabelList.add(gpr1_label1);
        gpr1LabelList.add(gpr1_label2);
        gpr1LabelList.add(gpr1_label3);
        gpr1LabelList.add(gpr1_label4);
        gpr1LabelList.add(gpr1_label5);
        gpr1LabelList.add(gpr1_label6);
        gpr1LabelList.add(gpr1_label7);
        gpr1LabelList.add(gpr1_label8);
        gpr1LabelList.add(gpr1_label9);
        gpr1LabelList.add(gpr1_label10);
        gpr1LabelList.add(gpr1_label11);
        gpr1LabelList.add(gpr1_label12);
        gpr1LabelList.add(gpr1_label13);
        gpr1LabelList.add(gpr1_label14);
        gpr1LabelList.add(gpr1_label15);
        gpr1LabelList.add(gpr1_label16);

        gpr2RadList.add(gpr2_rb1);
        gpr2RadList.add(gpr2_rb2);
        gpr2RadList.add(gpr2_rb3);
        gpr2RadList.add(gpr2_rb4);
        gpr2RadList.add(gpr2_rb5);
        gpr2RadList.add(gpr2_rb6);
        gpr2RadList.add(gpr2_rb7);
        gpr2RadList.add(gpr2_rb8);
        gpr2RadList.add(gpr2_rb9);
        gpr2RadList.add(gpr2_rb10);
        gpr2RadList.add(gpr2_rb11);
        gpr2RadList.add(gpr2_rb12);
        gpr2RadList.add(gpr2_rb13);
        gpr2RadList.add(gpr2_rb14);
        gpr2RadList.add(gpr2_rb15);
        gpr2RadList.add(gpr2_rb16);

        gpr2LabelList.add(gpr2_label1);
        gpr2LabelList.add(gpr2_label2);
        gpr2LabelList.add(gpr2_label3);
        gpr2LabelList.add(gpr2_label4);
        gpr2LabelList.add(gpr2_label5);
        gpr2LabelList.add(gpr2_label6);
        gpr2LabelList.add(gpr2_label7);
        gpr2LabelList.add(gpr2_label8);
        gpr2LabelList.add(gpr2_label9);
        gpr2LabelList.add(gpr2_label10);
        gpr2LabelList.add(gpr2_label11);
        gpr2LabelList.add(gpr2_label12);
        gpr2LabelList.add(gpr2_label13);
        gpr2LabelList.add(gpr2_label14);
        gpr2LabelList.add(gpr2_label15);
        gpr2LabelList.add(gpr2_label16);

        gpr3RadList.add(gpr3_rb1);
        gpr3RadList.add(gpr3_rb2);
        gpr3RadList.add(gpr3_rb3);
        gpr3RadList.add(gpr3_rb4);
        gpr3RadList.add(gpr3_rb5);
        gpr3RadList.add(gpr3_rb6);
        gpr3RadList.add(gpr3_rb7);
        gpr3RadList.add(gpr3_rb8);
        gpr3RadList.add(gpr3_rb9);
        gpr3RadList.add(gpr3_rb10);
        gpr3RadList.add(gpr3_rb11);
        gpr3RadList.add(gpr3_rb12);
        gpr3RadList.add(gpr3_rb13);
        gpr3RadList.add(gpr3_rb14);
        gpr3RadList.add(gpr3_rb15);
        gpr3RadList.add(gpr3_rb16);

        gpr3LabelList.add(gpr3_label1);
        gpr3LabelList.add(gpr3_label2);
        gpr3LabelList.add(gpr3_label3);
        gpr3LabelList.add(gpr3_label4);
        gpr3LabelList.add(gpr3_label5);
        gpr3LabelList.add(gpr3_label6);
        gpr3LabelList.add(gpr3_label7);
        gpr3LabelList.add(gpr3_label8);
        gpr3LabelList.add(gpr3_label9);
        gpr3LabelList.add(gpr3_label10);
        gpr3LabelList.add(gpr3_label11);
        gpr3LabelList.add(gpr3_label12);
        gpr3LabelList.add(gpr3_label13);
        gpr3LabelList.add(gpr3_label14);
        gpr3LabelList.add(gpr3_label15);
        gpr3LabelList.add(gpr3_label16);

        ixr1RadList.add(ixr1_rb1);
        ixr1RadList.add(ixr1_rb2);
        ixr1RadList.add(ixr1_rb3);
        ixr1RadList.add(ixr1_rb4);
        ixr1RadList.add(ixr1_rb5);
        ixr1RadList.add(ixr1_rb6);
        ixr1RadList.add(ixr1_rb7);
        ixr1RadList.add(ixr1_rb8);
        ixr1RadList.add(ixr1_rb9);
        ixr1RadList.add(ixr1_rb10);
        ixr1RadList.add(ixr1_rb11);
        ixr1RadList.add(ixr1_rb12);
        ixr1RadList.add(ixr1_rb13);
        ixr1RadList.add(ixr1_rb14);
        ixr1RadList.add(ixr1_rb15);
        ixr1RadList.add(ixr1_rb16);

        ixr1LabelList.add(ixr1_label1);
        ixr1LabelList.add(ixr1_label2);
        ixr1LabelList.add(ixr1_label3);
        ixr1LabelList.add(ixr1_label4);
        ixr1LabelList.add(ixr1_label5);
        ixr1LabelList.add(ixr1_label6);
        ixr1LabelList.add(ixr1_label7);
        ixr1LabelList.add(ixr1_label8);
        ixr1LabelList.add(ixr1_label9);
        ixr1LabelList.add(ixr1_label10);
        ixr1LabelList.add(ixr1_label11);
        ixr1LabelList.add(ixr1_label12);
        ixr1LabelList.add(ixr1_label13);
        ixr1LabelList.add(ixr1_label14);
        ixr1LabelList.add(ixr1_label15);
        ixr1LabelList.add(ixr1_label16);

        ixr2RadList.add(ixr2_rb1);
        ixr2RadList.add(ixr2_rb2);
        ixr2RadList.add(ixr2_rb3);
        ixr2RadList.add(ixr2_rb4);
        ixr2RadList.add(ixr2_rb5);
        ixr2RadList.add(ixr2_rb6);
        ixr2RadList.add(ixr2_rb7);
        ixr2RadList.add(ixr2_rb8);
        ixr2RadList.add(ixr2_rb9);
        ixr2RadList.add(ixr2_rb10);
        ixr2RadList.add(ixr2_rb11);
        ixr2RadList.add(ixr2_rb12);
        ixr2RadList.add(ixr2_rb13);
        ixr2RadList.add(ixr2_rb14);
        ixr2RadList.add(ixr2_rb15);
        ixr2RadList.add(ixr2_rb16);

        ixr2LabelList.add(ixr2_label1);
        ixr2LabelList.add(ixr2_label2);
        ixr2LabelList.add(ixr2_label3);
        ixr2LabelList.add(ixr2_label4);
        ixr2LabelList.add(ixr2_label5);
        ixr2LabelList.add(ixr2_label6);
        ixr2LabelList.add(ixr2_label7);
        ixr2LabelList.add(ixr2_label8);
        ixr2LabelList.add(ixr2_label9);
        ixr2LabelList.add(ixr2_label10);
        ixr2LabelList.add(ixr2_label11);
        ixr2LabelList.add(ixr2_label12);
        ixr2LabelList.add(ixr2_label13);
        ixr2LabelList.add(ixr2_label14);
        ixr2LabelList.add(ixr2_label15);
        ixr2LabelList.add(ixr2_label16);

        ixr3RadList.add(ixr3_rb1);
        ixr3RadList.add(ixr3_rb2);
        ixr3RadList.add(ixr3_rb3);
        ixr3RadList.add(ixr3_rb4);
        ixr3RadList.add(ixr3_rb5);
        ixr3RadList.add(ixr3_rb6);
        ixr3RadList.add(ixr3_rb7);
        ixr3RadList.add(ixr3_rb8);
        ixr3RadList.add(ixr3_rb9);
        ixr3RadList.add(ixr3_rb10);
        ixr3RadList.add(ixr3_rb11);
        ixr3RadList.add(ixr3_rb12);
        ixr3RadList.add(ixr3_rb13);
        ixr3RadList.add(ixr3_rb14);
        ixr3RadList.add(ixr3_rb15);
        ixr3RadList.add(ixr3_rb16);

        ixr3LabelList.add(ixr3_label1);
        ixr3LabelList.add(ixr3_label2);
        ixr3LabelList.add(ixr3_label3);
        ixr3LabelList.add(ixr3_label4);
        ixr3LabelList.add(ixr3_label5);
        ixr3LabelList.add(ixr3_label6);
        ixr3LabelList.add(ixr3_label7);
        ixr3LabelList.add(ixr3_label8);
        ixr3LabelList.add(ixr3_label9);
        ixr3LabelList.add(ixr3_label10);
        ixr3LabelList.add(ixr3_label11);
        ixr3LabelList.add(ixr3_label12);
        ixr3LabelList.add(ixr3_label13);
        ixr3LabelList.add(ixr3_label14);
        ixr3LabelList.add(ixr3_label15);
        ixr3LabelList.add(ixr3_label16);

        gprRadList.add(gpr0RadList);
        gprRadList.add(gpr1RadList);
        gprRadList.add(gpr2RadList);
        gprRadList.add(gpr3RadList);

        gprLabelList.add(gpr0LabelList);
        gprLabelList.add(gpr1LabelList);
        gprLabelList.add(gpr2LabelList);
        gprLabelList.add(gpr3LabelList);

        ixrRadList.add(ixr1RadList);
        ixrRadList.add(ixr2RadList);
        ixrRadList.add(ixr3RadList);

        ixrLabelList.add(ixr1LabelList);
        ixrLabelList.add(ixr2LabelList);
        ixrLabelList.add(ixr3LabelList);

        pcRadList.add(pc_rb1);
        pcRadList.add(pc_rb2);
        pcRadList.add(pc_rb3);
        pcRadList.add(pc_rb4);
        pcRadList.add(pc_rb5);
        pcRadList.add(pc_rb6);
        pcRadList.add(pc_rb7);
        pcRadList.add(pc_rb8);
        pcRadList.add(pc_rb9);
        pcRadList.add(pc_rb10);
        pcRadList.add(pc_rb11);
        pcRadList.add(pc_rb12);

        pcLabelList.add(pc_label1);
        pcLabelList.add(pc_label2);
        pcLabelList.add(pc_label3);
        pcLabelList.add(pc_label4);
        pcLabelList.add(pc_label5);
        pcLabelList.add(pc_label6);
        pcLabelList.add(pc_label7);
        pcLabelList.add(pc_label8);
        pcLabelList.add(pc_label9);
        pcLabelList.add(pc_label10);
        pcLabelList.add(pc_label11);
        pcLabelList.add(pc_label12);

        marRadList.add(mar_rb1);
        marRadList.add(mar_rb2);
        marRadList.add(mar_rb3);
        marRadList.add(mar_rb4);
        marRadList.add(mar_rb5);
        marRadList.add(mar_rb6);
        marRadList.add(mar_rb7);
        marRadList.add(mar_rb8);
        marRadList.add(mar_rb9);
        marRadList.add(mar_rb10);
        marRadList.add(mar_rb11);
        marRadList.add(mar_rb12);

        marLabelList.add(mar_label1);
        marLabelList.add(mar_label2);
        marLabelList.add(mar_label3);
        marLabelList.add(mar_label4);
        marLabelList.add(mar_label5);
        marLabelList.add(mar_label6);
        marLabelList.add(mar_label7);
        marLabelList.add(mar_label8);
        marLabelList.add(mar_label9);
        marLabelList.add(mar_label10);
        marLabelList.add(mar_label11);
        marLabelList.add(mar_label12);

        mbrRadList.add(mbr_rb1);
        mbrRadList.add(mbr_rb2);
        mbrRadList.add(mbr_rb3);
        mbrRadList.add(mbr_rb4);
        mbrRadList.add(mbr_rb5);
        mbrRadList.add(mbr_rb6);
        mbrRadList.add(mbr_rb7);
        mbrRadList.add(mbr_rb8);
        mbrRadList.add(mbr_rb9);
        mbrRadList.add(mbr_rb10);
        mbrRadList.add(mbr_rb11);
        mbrRadList.add(mbr_rb12);
        mbrRadList.add(mbr_rb13);
        mbrRadList.add(mbr_rb14);
        mbrRadList.add(mbr_rb15);
        mbrRadList.add(mbr_rb16);

        mbrLabelList.add(mbr_label1);
        mbrLabelList.add(mbr_label2);
        mbrLabelList.add(mbr_label3);
        mbrLabelList.add(mbr_label4);
        mbrLabelList.add(mbr_label5);
        mbrLabelList.add(mbr_label6);
        mbrLabelList.add(mbr_label7);
        mbrLabelList.add(mbr_label8);
        mbrLabelList.add(mbr_label9);
        mbrLabelList.add(mbr_label10);
        mbrLabelList.add(mbr_label11);
        mbrLabelList.add(mbr_label12);
        mbrLabelList.add(mbr_label13);
        mbrLabelList.add(mbr_label14);
        mbrLabelList.add(mbr_label15);
        mbrLabelList.add(mbr_label16);

        irRadList.add(ir_rb1);
        irRadList.add(ir_rb2);
        irRadList.add(ir_rb3);
        irRadList.add(ir_rb4);
        irRadList.add(ir_rb5);
        irRadList.add(ir_rb6);
        irRadList.add(ir_rb7);
        irRadList.add(ir_rb8);
        irRadList.add(ir_rb9);
        irRadList.add(ir_rb10);
        irRadList.add(ir_rb11);
        irRadList.add(ir_rb12);
        irRadList.add(ir_rb13);
        irRadList.add(ir_rb14);
        irRadList.add(ir_rb15);
        irRadList.add(ir_rb16);

        irLabelList.add(ir_label1);
        irLabelList.add(ir_label2);
        irLabelList.add(ir_label3);
        irLabelList.add(ir_label4);
        irLabelList.add(ir_label5);
        irLabelList.add(ir_label6);
        irLabelList.add(ir_label7);
        irLabelList.add(ir_label8);
        irLabelList.add(ir_label9);
        irLabelList.add(ir_label10);
        irLabelList.add(ir_label11);
        irLabelList.add(ir_label12);
        irLabelList.add(ir_label13);
        irLabelList.add(ir_label14);
        irLabelList.add(ir_label15);
        irLabelList.add(ir_label16);

        consoleText.setEditable(false);

        gpr0_ld_Bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int[] data = getValidValueFromText();
                System.out.println(checkValid(data));
                if(checkValid(data)) {
                    setGPRData(0, data);
                    register0 = m_util.binToInt(data);
                }else{
                    setWarmingLabel("Invalid Input");
                }
            }
        });
        gpr1_ld_Bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] data = getValidValueFromText();
                System.out.println(checkValid(data));
                if(checkValid(data)) {
                    setGPRData(1, data);
                    register1 = m_util.binToInt(data);
                }else{
                    setWarmingLabel("Invalid Input");
                }
            }
        });
        gpr2_ld_Bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] data = getValidValueFromText();
                System.out.println(checkValid(data));
                if(checkValid(data)) {
                    setGPRData(2, data);
                    register2 = m_util.binToInt(data);
                }else{
                    setWarmingLabel("Invalid Input");
                }
            }
        });
        gpr3_ld_Bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] data = getValidValueFromText();
                System.out.println(checkValid(data));
                if(checkValid(data)) {
                    setGPRData(3, data);
                    register3 = m_util.binToInt(data);
                }else{
                    setWarmingLabel("Invalid Input");
                }
            }
        });
        ixr1_ld_Bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] data = getValidValueFromText();
                System.out.println(checkValid(data));
                if(checkValid(data)) {
                    setIXRData(0, data);
                    indexRegister1 = m_util.binToInt(data);
                }else{
                    setWarmingLabel("Invalid Input");
                }
            }
        });
        ixr2_ld_Bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] data = getValidValueFromText();
                System.out.println(checkValid(data));
                if(checkValid(data)) {
                    setIXRData(1, data);
                    indexRegister2 = m_util.binToInt(data);
                }else{
                    setWarmingLabel("Invalid Input");
                }
            }
        });
        ixr3_ld_Bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] data = getValidValueFromText();
                System.out.println(checkValid(data));
                if(checkValid(data)) {
                    setIXRData(2, data);
                    indexRegister3 = m_util.binToInt(data);
                }else{
                    setWarmingLabel("Invalid Input");
                }
            }
        });
        pc_ld_Bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] data = getValidValueFromText();
                System.out.println(checkValid(data));
                if(checkValid(data)) {
                    if (data.length != 12) {
                        setWarmingLabel("Invalid Input");
                    }else {
                        setPCData(data);
                    }
                }else{
                    setWarmingLabel("Invalid Input");
                }
            }
        });
        mar_ld_Bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] data = getValidValueFromText();
                System.out.println(checkValid(data));
                if(checkValid(data)) {
                    if (data.length != 12) {
                        setWarmingLabel("Invalid Input");
                    }else {
                        setMARData(data);
                    }
                }else{
                    setWarmingLabel("Invalid Input");
                }
            }
        });
        mbr_ld_Bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] data = getValidValueFromText();
                System.out.println(checkValid(data));
                if(checkValid(data)) {
                    if (data.length != 16) {
                        setWarmingLabel("Invalid Input");
                    }else {
                        setMBRData(data);
                    }
                }else{
                    setWarmingLabel("Invalid Input");
                }
            }
        });
        ir_ld_Bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] data = getValidValueFromText();
                System.out.println(checkValid(data));
                if(checkValid(data)) {
                    if (data.length != 16) {
                        setWarmingLabel("Invalid Input");
                    }else {
                        setIRData(data);
                    }
                }else{
                    setWarmingLabel("Invalid Input");
                }
            }
        });
        storeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] marRebin = getMARValue();
                int[] mbrRebin = getMBRValue();
                int marRe = m_util.binToInt(marRebin);
                int mbrRe = m_util.binToInt(mbrRebin);

                System.out.println(marRe);
                System.out.println(mbrRe);
                if(marRe >= memoryStart) {
                    memory.put(marRe, mbrRe);
                    setGPRData(0, mbrRebin);
                    setWarmingLabel("Value " + Integer.toString(mbrRe) + " in location " + Integer.toString(marRe));
                }else{
                    setWarmingLabel("The address " + Integer.toString(marRe) + " is reserved Address");
                    //int[] data = new int[]{0,0,0,1};
                    //setMFR(data);
                }
            }
        });
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int marRe = m_util.binToInt(getMARValue());
                System.out.println(marRe);
                if(marRe < memoryStart){
                    setWarmingLabel("The address" + Integer.toString(marRe) + " is reserved");
                    //int[] data = new int[]{0,0,0,1};
                    //setMFR(data);
                }else if(!memory.containsKey(marRe)){
                    setWarmingLabel("The address" + Integer.toString(marRe) + " has no data");
                    int[] data16 =new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                    setMBRData(data16);
                }else {
                    int mbrRe = memory.get(marRe);
                    System.out.println(mbrRe);
                    String mbr = Integer.toBinaryString(mbrRe);

                    int[] value = new int[16];
                    for (int i = 0; i < 16; i++) {
                        if (i < 16 - mbr.length()) {
                            value[i] = 0;
                        } else {
                            value[i] = Integer.parseInt("" + mbr.charAt(i - (16 - mbr.length())));
                        }
                    }
                    System.out.println(value);
                    setMBRData(value);
                    setWarmingLabel("Location " + Integer.toString(marRe) + " is " + Integer.toString(mbrRe));
                }
            }
        });
        IPLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetAllValue();
                try {
                    loadIPLFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        });


    }

    boolean setGPRData(int index, int data[]) {
        switch (index){
            case 0:{
                register0 = m_util.binToInt(data);
                break;
            }
            case 1:{
                register1 = m_util.binToInt(data);
                break;
            }
            case 2:{
                register2 = m_util.binToInt(data);
            }
            case 3:{
                register3 = m_util.binToInt(data);
            }
        }

        ArrayList<JRadioButton> re_gprRad = gprRadList.get(index);
        ArrayList<JLabel> re_gprLabel = gprLabelList.get(index);
        if(data.length != 16){
            setWarmingLabel("Invalid input");
            return false;
        }
        for (int i = 0; i < re_gprRad.size(); i++) {
            re_gprLabel.get(i).setText(Integer.toString(data[i]));
            if (data[i] == 0) {
                re_gprRad.get(i).setSelected(false);
            } else {
                re_gprRad.get(i).setSelected(true);
            }
        }
        return true;
    }

    boolean setIXRData(int index, int data[]) {
        switch (index){
            case 0:{
                indexRegister1 = m_util.binToInt(data);
                break;
            }
            case 1:{
                indexRegister2 = m_util.binToInt(data);
            }
            case 2:{
                indexRegister3 = m_util.binToInt(data);
            }
        }

        ArrayList<JRadioButton> re_ixrRad = ixrRadList.get(index);
        ArrayList<JLabel> re_ixrLabel = ixrLabelList.get(index);
        if(data.length != 16){
            setWarmingLabel("Invalid input");
            return false;
        }
        for (int i = 0; i < re_ixrRad.size(); i++) {
            re_ixrLabel.get(i).setText(Integer.toString(data[i]));
            if (data[i] == 0) {
                re_ixrRad.get(i).setSelected(false);
            } else {
                re_ixrRad.get(i).setSelected(true);
            }
        }
        return true;
    }

    boolean setPCData(int data[]){
        for (int i = 0; i < data.length; i++) {
            pcLabelList.get(i).setText(Integer.toString(data[i]));
            if (data[i] == 0) {
                pcRadList.get(i).setSelected(false);
            } else {
                pcRadList.get(i).setSelected(true);
            }
        }
        return true;
    }

    boolean setMARData(int data[]){
        for (int i = 0; i < data.length; i++) {
            marLabelList.get(i).setText(Integer.toString(data[i]));
            if (data[i] == 0) {
                marRadList.get(i).setSelected(false);
            } else {
                marRadList.get(i).setSelected(true);
            }
        }
        return true;
    }

    boolean setMBRData(int data[]){
        for (int i = 0; i < data.length; i++) {
            mbrLabelList.get(i).setText(Integer.toString(data[i]));
            if (data[i] == 0) {
                mbrRadList.get(i).setSelected(false);
            } else {
                mbrRadList.get(i).setSelected(true);
            }
        }
        return true;
    }

    boolean setIRData(int data[]){
        for (int i = 0; i < data.length; i++) {
            irLabelList.get(i).setText(Integer.toString(data[i]));
            if (data[i] == 0) {
                irRadList.get(i).setSelected(false);
            } else {
                irRadList.get(i).setSelected(true);
            }
        }
        return true;
    }

    int[] getValidValueFromText(){
        String value = commandText.getText();
        System.out.println(value);
        int[] result;
        result = new int[value.length()];
        for (int i = 0; i < value.length(); i++) {
            String tmp = String.valueOf(value.charAt(i));
            result[i] = Integer.parseInt(tmp);
            System.out.print(result[i]);
        }
        return result;
    }

    int[] getMARValue(){
        int[] re = new int[12];
        int flag = 1;
        for(int i = 0; i < marRadList.size(); i++){
            System.out.println(marRadList.get(i).isSelected());
            if(marRadList.get(i).isSelected()){

                re[i] = 1;
            }else{
                re[i] = 0;
            }
        }
        return re;
    }

    int[] getMBRValue(){
        int[] re = new int[16];
        int flag = 1;
        for(int i = 0; i < mbrRadList.size(); i++){
            if(mbrRadList.get(i).isSelected()){
                re[i] = 1;
            }else{
                re[i] = 0;
            }
        }
        return re;
    }

    int[] getPCValue(){
        int[] re = new int[12];
        int flag = 1;
        for(int i = 0; i < pcRadList.size(); i++){
            if(pcRadList.get(i).isSelected()){
                re[i] = 1;
            }else{
                re[i] = 0;
            }
        }
        return re;
    }

    boolean checkValid(int[] value){
        for (int i = 0; i < value.length; i++){
            if (!(value[i] == 0 || value[i] == 1)){
                return false;
            }
        }
        return true;
    }

    void setWarmingLabel(String value){
        WarmingLabel.setText(value);
    }

    void resetAllValue(){
        int[] data16 =new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] data12 = new int[]{0,0,0,0,0,0,0,0,0,0,0,0};

        setGPRData(0,data16);
        setGPRData(1,data16);
        setGPRData(2,data16);
        setGPRData(3,data16);
        setIXRData(0,data16);
        setIXRData(1,data16);
        setIXRData(2,data16);

        setPCData(data12);
        setMARData(data12);
        setMBRData(data16);
        setIRData(data16);
    }

    void loadIPLFile() throws IOException {
        File f = new File("IPL.txt");
        setWarmingLabel(f.getAbsolutePath());
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(f));
        String tempString;
        String comment = "";
        boolean isfirst = true;
        while ((tempString = reader.readLine()) != null){
            int address = Integer.parseInt(tempString.split(" ")[0],16);
            int value = Integer.parseInt(tempString.split(" ")[0],16);
            String temp;
            memory.put(address,value);
            temp = "The value of address " + Integer.toString(address) +" is " + Integer.toString(value) + "";
            if(address < usefulStart){
                usefulStart = address;
            }
            if(!isfirst) {
                comment = comment + "; " + temp;
            }else{
                isfirst = false;
                comment = comment + temp;
            }
        }
        reader.close();

        String usefulStartBin = Integer.toBinaryString(usefulStart);
        int[] startAddress = new int[12];
        System.out.println(usefulStartBin.length());
        for(int i = 0; i < 12; i ++){
            if(i < 12 - usefulStartBin.length()){
                startAddress[i] = 0;
            }else{
                startAddress[i] = Integer.parseInt(""+usefulStartBin.charAt(i - (12 - usefulStartBin.length())));
            }

        }
        System.out.println(startAddress);
        setMARData(startAddress);

        String usefulStartValueBin = Integer.toBinaryString(memory.get(usefulStart));
        int[] value = new int[16];
        for(int i = 0; i < 16 ; i ++){
            if(i < 16 - usefulStartValueBin.length()){
                value[i] = 0;
            }else{
                value[i] = Integer.parseInt(""+usefulStartValueBin.charAt(i - (16 - usefulStartValueBin.length())));
            }
        }
        System.out.println(value);
        setMBRData(value);

        setWarmingLabel(comment);
    }

    int getRegValue(int index){
        int value = 0;
        switch (index){
            case 0:{
                value = register0;
                break;
            }
            case 1:{
                value = register1;
                break;
            }
            case 2:{
                value = register2;
                break;
            }
            case 3:{
                value = register3;
                break;
            }
        }
        return value;
    }

    int getIRegValue(int index){
        int value = 0;

        switch (index){
            case 0:{
                value = indexRegister1;
                break;
            }
            case 1:{
                value = indexRegister2;
                break;
            }
            case 2:{
                value = indexRegister3;
                break;
            }
        }
        return value;
    }

    int eightBaseToten(int tenBase){
        int re = 0;
        int index = 0;
        while(tenBase > 0){
            re = re + (tenBase%10)*(int)Math.pow(8,index);
            tenBase = tenBase/10;
            index++;
        }
        return re;
    }

    void setMFR(int[] data){
        mfr_label1.setText(Integer.toString(data[0]));
        mfr_label2.setText(Integer.toString(data[1]));
        mfr_label3.setText(Integer.toString(data[2]));
        mfr_label4.setText(Integer.toString(data[3]));

        for(int i = 0; i < data.length; i ++){
            if(data[i] == 1){
                switch (i){
                    case 1:{
                        mfr_rb1.setSelected(true);
                        break;
                    }
                    case 2:{
                        mfr_rb2.setSelected(true);
                        break;
                    }
                    case 3:{
                        mfr_rb3.setSelected(true);
                        break;
                    }
                    case 4:{
                        mfr_rb4.setSelected(true);
                        break;
                    }
                }
            }
        }

    }

    /*void Search_20_Numbers(int indx)
    {
        int searchnumber = getRegValue(indx);
        int localBase = 10;
        int diff = 65535;
        int closest_address = localBase;

        for(int i=localBase ; i<(localBase+20) ; i++)
        {
            int searchsample = memory.get(i);
            if(searchsample==0)
            {
                System.out.println("Please fill all 20 values");
                break;
            }
            int dif_comp = (searchsample - searchnumber);
            if(Math.abs(dif_comp)<diff)
            {
                diff = Math.abs(dif_comp);
                closest_address = i;
            }
        }

        if(diff<65535)
        {
            loadRegfromMem(closest_address,2);
            outputValue(2,1);
        }
    }*/
}
