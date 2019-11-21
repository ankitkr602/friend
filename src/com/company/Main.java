package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = 0, k , d = 0,l;
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ch=sc.next();
        s=s+" "+ch;
        l = s.length();
       // System.out.println(l);
        char c = s.charAt(l - 1);
        for (int i = 0; i <= (l - 2); i++) {
            if (s.charAt(i) == c) {
                k = i;
                //System.out.println(k);
                for (int j = n; j <= k; j++) {
                    for (int p = j; p <l-2; p++) {
                        d++;

                    }
                    d = d - (k - j);
                }
                n = k + 1;
            }
        }
        System.out.println(d);
    }
}



