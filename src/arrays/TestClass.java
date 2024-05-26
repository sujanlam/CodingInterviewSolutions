package com.codes.arrays;

public class TestClass {
    public static void main(String[] args) {
        /*String str = "A man, a plan, a canal, Panama!";
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        String cpdomains = "9001 discuss.leetcode.com";
        String[] sss = cpdomains.split("[. ]");
        for (String ss:sss ){
            System.out.print(ss);
        }
        System.out.println("========================");
        for (int i = 0; i < sss.length; i++) {
            System.out.print(sss[i]+i);
        }
        */


        String cpdomains = "9001 discuss.leetcode.com";
        int count = Integer.parseInt(cpdomains.substring(0,cpdomains.indexOf(" ")));
        System.out.println(count);
        String fullDomain = cpdomains.substring(cpdomains.indexOf(" ")+1);
        System.out.println(fullDomain);
        //System.out.println(s.substring(s.indexOf(".")+1));


    }
    public static boolean existsHigher(int[] arr, int n) {
        for (int numInArr: arr){
            if(numInArr >= n){
                return true;
            }
        }
        return false;
    }
    public static String fizzBuzz(int n) {
        String result="";
        if(n % 5 == 0 && n % 3 == 0){
            result += "FizzBuzz";
        }else if(n % 5 == 0){
            result +="Buzz";
        }else if(n % 3== 0){
            result += "Fizz";

        }else{
            result += String.valueOf(n);
        }
        return result;
    }
}
