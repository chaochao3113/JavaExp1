package com.company;

import java.math.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i < 100; i++)
        {
            int x = 0;
            for (int j=2;j<=Math.sqrt(i);j++)
                if(i % j == 0)
                    x = 1;
            if (x == 0)
                System.out.println(i);
        }
    }
}
