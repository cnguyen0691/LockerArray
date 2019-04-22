package com.company;

public class Main {
    public static void main(String[] args) {
        boolean[] locker = new boolean[101];

        for (int i = 1; i < locker.length; i++) {
            for (int j = i; j < locker.length; j +=i) {
                locker[j] = !locker[j];
            }
        }

       //Print locker open
        for (int i = 0; i < locker.length; i++) {
            if (locker[i] == true)
                System.out.println("locker " + i + " is open.");
        }
    }
}