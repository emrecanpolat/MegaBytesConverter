package com.company;

public class Main {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(6000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = kiloBytes / 1024;
        int myRemainder = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + myRemainder + " KB");

    }




}
