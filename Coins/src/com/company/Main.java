package com.company;

import java.util.Scanner;

public class Main {

    class Otvet {
        public static int Coin(int n) {
            int start=1;
            int sum=1;
            while( sum <= n){
                sum+= ++start;
            }
            return (int) start-1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = Otvet.Coin(x);
        System.out.println(n);
    }
}
