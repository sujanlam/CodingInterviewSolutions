package com.codes.strings;

public class NextSequenceProblem {
    public static void main(String[] args) {
        String sequence = "AA99999";
        String sequence1 = "AZ00001";
        System.out.println(nextSequence(sequence));

        String aa = "ABV";
        char a = aa.charAt(0);
        System.out.println(++a);
    }

    private static String nextSequence(String sequence) {
        if (sequence.equals("ZZ99999")) {
            return "Exception: Only validated between AA00001 and ZZ99999";
        }
        String prefix = sequence.substring(0,2);
        int num = Integer.parseInt(sequence.substring(2));

        if (num == 99999) {
            char charPart1 = sequence.charAt(0); //A
            char charPart2 = sequence.charAt(1); //Z
            if(charPart2=='Z'){
                charPart1++;
                charPart2 ='A';
            }else{
                charPart2++;
            }
            prefix = String.valueOf(charPart1)+String.valueOf(charPart2);
            num = 1;

        } else {
            num++;
        }

        return prefix+String.format("%05d", num);
    }
}
