package com.bridgelab;

import java.util.Scanner;  //import  scanner class

public class ReverseNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //create object for scanner class

        int num , reversed = 0;

        System.out.print("Enter number to reverse it : ");

        num = sc.nextInt();

        /*
        while loop use
         */

        while(num != 0) {

            int digit = num % 10;

            reversed = reversed * 10 + digit;
            
            num /= 10;

        }

        System.out.println("Reversed Number: " + reversed);
    }

    }

