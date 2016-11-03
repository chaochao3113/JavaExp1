package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.printf("%d * %d = %d  ",j,i,i*j);
            }
            System.out.println();
        }
    }
}
