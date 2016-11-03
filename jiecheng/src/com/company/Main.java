package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        long x = 0;
        for (int i = 1; i <= 20; i++)
        {
            long w=1;
            for (int j = 1; j <= i; j++)
            {
                w*=j;
            }
            x+=w;
        }
        System.out.println(x);
    }
}
