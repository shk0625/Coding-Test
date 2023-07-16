package Beakjoon.n_2440;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getNum = sc.nextInt();
        for(int i = 0; i<getNum; i++) {
            for (int j = getNum; j>i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
