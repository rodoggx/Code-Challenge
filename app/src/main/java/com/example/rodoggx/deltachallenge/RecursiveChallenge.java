package com.example.rodoggx.deltachallenge;

/**
 * Created by RodoggX on 2/2/2018.
 */

public class RecursiveChallenge {


    public static void main(String[] args) {

        String rawStr = "Apple launched Iphone X yesterday";

        reverseString(rawStr);
    }

    //create a recurcive funtion to reverse a string


    public static String reverseString(String str) {

        StringBuilder stringBuilder;

        stringBuilder = new StringBuilder();
//check if the string is of min length
        if (str == null || str.length() <= 1) {
//            stringBuilder.append(str);
            return str;
        } else {
            return reverseString(str.substring(1) + str.charAt(0));//recursive call
        }

    }
}
