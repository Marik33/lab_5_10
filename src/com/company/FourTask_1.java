package com.company;

public class FourTask_1 {

    public static void main(String[] args) {

        int n,f;

        n = 10;
        f = 1;

        for (int i = 1;i <= n; i++) {
            f = f * i;
        }
        System.out.println(n+"! = "+f);
    }
}