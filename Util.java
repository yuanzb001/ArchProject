import java.util.HashMap;

public class Util {
    int binToInt(int[] data){
        int re = 0;
        int flag = 1;
        for(int i = data.length-1; i > 0; i--){
            re += flag*data[i];
            flag = flag*2;
        }
        return re;
    }

    int[] intToBin(int data, int range){
        int[] re = new int[range];
        String temp = Integer.toBinaryString(data);
        for(int i = 0; i < range; i++){
            if(i < (range - temp.length())){
                re[i] = 0;
            }else {
                re[i] = Integer.parseInt(String.valueOf(temp.charAt(i - (range - temp.length()))));
            }
        }
        return re;
    }

    HashMap<String,Integer> decodeData(String data){
        HashMap<String,Integer> res = new HashMap<>();
        int[] dataShow = new int[16];
        String opCode = data.substring(0,6);
        int a = Integer.parseInt("1",8);
        switch (Integer.parseInt(opCode,2)){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 33:
            case 34:{
                String register = data.substring(6, 8);
                String ix = data.substring(8, 10);
                String i = data.substring(10, 11);
                String address = data.substring(11, 16);
                res.put("opCode", Integer.parseInt(opCode, 2));
                res.put("register", Integer.parseInt(register, 2));
                res.put("ix", Integer.parseInt(ix, 2));
                res.put("i", Integer.parseInt(i, 2));
                res.put("address", Integer.parseInt(address, 2));
                break;
            }
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:{
                String rx = data.substring(6, 8);
                String ry = data.substring(8, 10);

                res.put("rx", Integer.parseInt(rx,2));
                res.put("ry", Integer.parseInt(ry,2));
                break;
            }
            case 25:
            case 26:{
                String r = data.substring(6,8);
                String AL = data.substring(8,9);
                String LR = data.substring(9,10);
                String Count = data.substring(12,16);

                res.put("register", Integer.parseInt(r,2));
                res.put("AL", Integer.parseInt(AL,2));
                res.put("LR", Integer.parseInt(LR,2));
                res.put("Count", Integer.parseInt(Count,2));
                break;
            }
            case 49:
            case 50:
            case 51:{
                String r = data.substring(6,8);
                String DevID = data.substring(11,16);

                res.put("register", Integer.parseInt(r,2));
                res.put("DevID", Integer.parseInt(DevID,2));
                break;
            }
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 40:{
                String fr = data.substring(6,8);
                String i = data.substring(8,9);
                String ix = data.substring(9,11);
                String address = data.substring(11,16);

                res.put("fr", Integer.parseInt(fr,2));
                res.put("i", Integer.parseInt(i,2));
                res.put("ix", Integer.parseInt(ix,2));
                res.put("address", Integer.parseInt(address,2));
                break;
            }
        }
        for (int j = 0; j < data.length(); j++){
            dataShow[j] = Integer.parseInt(String.valueOf(data.charAt(j)));
        }
        return res;
    }
}
