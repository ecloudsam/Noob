package com.company;

import java.util.*;

public class FourDoors {
    public static void main (String[] args) {

        int stayWins = 0;
        int changeWins = 0;
        Random gen = new Random();

        for(int i = 0; i<1000000; i++){
            int[] doors = {0,0,0,0};
            doors[gen.nextInt(4)] = 1;

            int choose = gen.nextInt(4);
            int show;
            do{
                show = gen.nextInt(4);
            }while(doors[show] == 1 || show == choose);

            if(doors[choose] == 1){
                stayWins = stayWins + 1;
            }else{
                int change;
                do{
                    change = gen.nextInt(4);
                }while(change == choose || change == show);
                if(doors[change] == 1){
                    changeWins = changeWins + 1;
                }
            }
        }
        System.out.println("保持选择胜利次数："+(stayWins));
        System.out.println("改变选择胜利次数："+(changeWins));
    }
}
