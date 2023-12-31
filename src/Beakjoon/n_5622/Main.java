package Beakjoon.n_5622;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            count += toNum(input.charAt(i));
        }

        System.out.println(count + input.length());
    }


        static int toNum(char a){
            switch (a) {
                case 'A':
                case 'B':
                case 'C':
                    return 2;
                case 'D':
                case 'E':
                case 'F':
                    return 3;
                case 'G':
                case 'H':
                case 'I':
                    return 4;
                case 'J':
                case 'K':
                case 'L':
                    return 5;
                case 'M':
                case 'N':
                case 'O':
                    return 6;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    return 7;
                case 'T':
                case 'U':
                case 'V':
                    return 8;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    return 9;
            }

            return 0;
        }

}
