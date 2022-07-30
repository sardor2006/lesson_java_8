package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int year = 2000; // berilgan yil

        if (   (year % 4 == 0) &&   (year % 100 != 0) ||  (year % 400 == 0) ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    }

