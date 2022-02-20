package com.bridgelab;

public class CouponNumber {

    public static void main(String[] args) {

        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();

        int max = 100000000;

        double d = Math.random();

        int random = (int) (d * max);

        String ch = " ";

        System.out.println("random double " + d + " random at start " + random);

        /*
        using while loop
         */

        while (random > 0) {

            ch = ch + (chars[random % chars.length]);

            random /= chars.length;

            System.out.println(random + "  " + random % chars.length + " ch is " + ch);
        }

        String couponCode = ch.toString();

        System.out.println("Coupon Code: " + couponCode);
    }
}

