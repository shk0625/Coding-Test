package Beakjoon.n_2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] getNum = new int[9];
        int max = Integer.MIN_VALUE;;
        int arraylocation = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< getNum.length; i++) {
            getNum[i] = sc.nextInt();
            if(getNum[i]>max){
                max = getNum[i];
                arraylocation = i;
            }
        }
        System.out.println(max);
        System.out.println(arraylocation+1);
    }
}
