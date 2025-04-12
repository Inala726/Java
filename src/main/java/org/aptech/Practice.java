package org.aptech;

import org.aptech.String.StringDemo;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
     String str = "Apextech";
//        System.out.println(str.charAt(str.length()-1));
//        StringBuilder str2 = new StringBuilder(str);
//        System.out.println(str2.reverse());
//        int c = str.indexOf("c");
//        System.out.println(c);
//        String[] strArr = str.split(" ");
//        System.out.println(Arrays.toString(strArr));
//        boolean isFound = str.contains("x");
//        System.out.println(isFound);
//        String password = "12345";
//        String confirmPassword = "12345bb";
//        String confam = new String("12345bBc");
//        System.out.println(confirmPassword.equalsIgnoreCase(confam));
//        int age = 21;
//        String ageOld = String.valueOf(age);
//        String s4 = "This is lovely";
//        char[] charArray = s4.toCharArray();
//        System.out.println(charArray);
        int[] values = {2,6,8,5,20,13};

        System.out.println(Arrays.toString(twoIndex(values, 21)));

    }
    public static int countOccurrence(String str, char c){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char characters = str.charAt(i);
            if(characters == c) count++;
        }
        return count;
    }

    public static int countLetter (String str){
        int vCount = 0;
        String vowels = "aeiou";
        str = str.toLowerCase();
        for(int i= 0; i<str.length(); i++){
            if (vowels.indexOf(str.charAt(i)) != -1){
                vCount++;
            }
            }
       return vCount;
    }

    public static int substringLength(String str){
        String pivot;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) == i) {

            }
        }
        return 0;
    }

    public static int[] twoIndex(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int secNum = arr[j];
                for (int k = j+1; k < arr.length; k++) {
                    int num3 = arr[k];
                    if(num+secNum+num3 ==target){
                        return new int[]{i,j,k};
                    }
                }
            }
        }
        return new int[]{};
    }

//    find the maximum product of two integers in an array.
    public static int[]

}