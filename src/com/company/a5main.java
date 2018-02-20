package com.company;

import java.util.Scanner;

public class a5main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter int: ");

        int i = keyboard.nextInt();

        fib(0, i, " ");

    }


    static int fib(int level, int n, String indent) {
        System.out.println(indent + "Entering level " + level);
        if (n <= 1) {
            System.out.println(indent + "Exiting level " + level);
            return 1;
        }
        else {


            int f = fib(level + 2, n - 2, indent + "    ") + fib(level + 1, n - 1, indent + "  ");
            System.out.println(indent + "Exiting level " + level);
            return f;
        }

    }


}
