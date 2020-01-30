/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        int length = s.length();
        String[] arr = s.split(s);
        for(int i=0, j=length-1;i<length;i++,j--){
            String a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;
        }
        return new String();
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        return new String();
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        char[] c1 = s.toCharArray();
        int length = s.length();
        for(int i=0; i<length; i++){
            if(c1[i]==c1[i+1]){
                System.out.println(c1);
            }
            else {
                System.out.println("Character not found");
            }
        }
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        originalString.replaceAll("College", "University");
        return new String();
    }
}
