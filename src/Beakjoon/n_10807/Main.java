package Beakjoon.n_10807;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //총 갯수
        int[] arr = new int[n];

        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt(); // 알고싶은 숫자
        int count = 0;

        for(int i =0; i<n; i++){
            if(arr[i]==v){
                count++;
            }
        }
        System.out.println(count);

    }
}
