package com.company;

public class FourTask_2 {

    public static void main(String[] args) {

        int n, f, i;

        f = 1;
        n = 10;
        i = 1;

        while(i<=n) {
            f = f * i;
            i++;
        }
        System.out.println(n+"! = "+f);
    }
}