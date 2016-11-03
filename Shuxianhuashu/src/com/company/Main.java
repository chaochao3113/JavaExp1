package com.company;

import java.math.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i=100;i<1000;i++)
        {
            int a = i%10;
            int b = i/10%10;
            int c = i/100;
            if (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i)
                System.out.println(i);
        }
    }
}
