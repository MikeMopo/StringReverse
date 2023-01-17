package com.algo;

public class StringReversor {
    public static String reversalMethod(String input) {
        String [] stringToreverse = input.split("\\s");
        String reversedString = "";

        if(stringToreverse.length>0){
        for(int i = stringToreverse.length-1; i>=0;i--){
            StringBuilder intermediateString = new StringBuilder(stringToreverse[i]);
            reversedString += intermediateString.toString() + " ";
        }

        return reversedString.trim();
        }
        else
            return "String invalid";
    }
}
