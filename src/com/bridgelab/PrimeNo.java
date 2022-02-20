package com.bridgelab;

import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {

    int temp;               //take two variable temp and isaprime
    boolean isPrime=true;

    Scanner scan= new Scanner(System.in);   //create object for scanner class

        System.out.println("Enter any number:");

    //capture the input in an integer

    int num=scan.nextInt();

    /*
    using for loop
     */

        for(int i=2;i<num;i++) {

        temp=num%i;

        /*

        check condition

        */

        if(temp==0) {

            isPrime=false;
            break;
        }
    }

    //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
                System.out.println(num + " is not a Prime Number");
}

}
