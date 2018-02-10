package com.company;

import java.util.*;

public class ThreeDoors {
    public static void main (String[] args) {
        int stayWins = 0;
        int changeWins = 0;
        Random gen = new Random();

        for(int i = 0; i<10000; i++){
            int[] doors = {0,0,0};
            doors[gen.nextInt(3)] = 1;

            int choose = gen.nextInt(3);
            int show;
            do{
                show = gen.nextInt(3);
            }while(doors[show] == 1 || show == choose);

            if(doors[choose] == 1){
                stayWins = stayWins + 1;
            }else{
                if(doors[3 - choose - show] == 1){
                    changeWins = changeWins + 1;
                }
            }
        }
        System.out.println("保持选择胜利次数："+(stayWins));
        System.out.println("改变选择胜利次数："+(changeWins));
    }

}
