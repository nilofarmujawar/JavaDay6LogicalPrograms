package com.bridgelab;

import java.util.Scanner; // import scanner class

public class StopWatch {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);  //create object for scanner class

        int start= sc.nextInt();

        int stop= sc.nextInt();

        if (start == 0) {

            long a = System.currentTimeMillis(); //Returns the current time in milliseconds

        } else if (stop == 0) {

            long b = System.currentTimeMillis();  //Returns the current time in milliseconds

        } else {

            System.out.println("enter 0 to start");

        }

        long diff = stop - start;

        System.out.println("The difference between start and stop is " + diff);
    }


}
