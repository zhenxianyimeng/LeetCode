package com.leetcode.weekly.contest136;

public class T5055 {
    public static void main(String[] args) {
        String in = "GL";
        T5055 t = new T5055();
        System.out.println(t.isRobotBounded(in));
    }

    public boolean isRobotBounded(String instructions) {
        if(instructions == null || instructions.length() == 0){
            return false;
        }
        char[] chs = instructions.toCharArray();
        int[] pos = new int[2];
        int direction = 1;
        for (int i = 0; i <4 ; i++) {
            for (char ch : chs){
                if(ch == 'L'){
                    direction = (direction +1)%4;
                }else if(ch == 'R'){
                    direction = (4+direction-1)%4;
                }else if(ch == 'G'){
                    switch (direction){
                        case 0:
                            pos[0]++;
                            break;
                        case 1:
                            pos[1]++;
                            break;
                        case 2:
                            pos[0]--;
                            break;
                        case 3:
                            pos[1]--;
                            break;
                        default:
                            break;
                    }
                }
            }
        }



        if(pos[0]==0 && pos[1]==0)
            return true;

        return false;
    }


}

