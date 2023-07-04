package Beakjoon.n_25206;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double average = 0.0000;
        double sum = 0.000;

        for(int i=0; i<20; i++){
            sc.next(); //과목명
            double calculator = sc.nextDouble(); //학점
            String grade = sc.next(); // 등급
            if(grade.equals("P")){
                continue;
            }
            sum+=ToAverage(grade)*calculator;
            average+=calculator;
        }
        System.out.println(sum/average);
    }

    static double ToAverage(String grade) {
        switch (grade) {
            case "A+":
                return 4.5000;
            case "A0":
                return 4.0000;
            case "B+":
                return 3.5000;
            case "B0":
                return 3.0000;
            case "C+":
                return 2.5000;
            case "C0":
                return 2.0000;
            case "D+":
                return 1.5000;
            case "D0":
                return 1.0000;
            case "F":
                return 0.0000;
            default:
                 return -1.0000;
        }
    }
}
