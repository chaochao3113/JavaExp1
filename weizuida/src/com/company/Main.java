package com.company;

import java.util.Scanner;

class A
{
    private  int x;
    public void SetX(int x)
    {
        this.x=x;
    }
    public void show()
    {
        while (x!=0)
        {
            System.out.println(x%10);
            x=x/10;
        }
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
        A a = new A();
        Scanner sc = new Scanner(System.in);
        a.SetX(sc.nextInt());
        a.show();
    }
}
