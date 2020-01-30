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
public class C0766552Main {

    public static void main(String[] args) 
    {
        System.out.println("\n--- Reverse Words");
        String rev = LambtonStringTools.reverse("Failure will never overtake me if my determination to succeed is strong enough");
        System.out.println("Input  : Failure will never overtake me if my determination to succeed is strong enough");

        LambtonStringTools n1 = new LambtonStringTools();
        System.out.println("Output : " + n1.reverse("Failure will never overtake me if my determination to succeed is strong enough"));

        rev = LambtonStringTools.reverse(null);
        System.out.println("Input  : NULL");
        if(rev == null)
        {
           System.out.println("Function returns NULL value");
        }else {
            System.out.println("Output : " + rev);
        }
        
        System.out.println("\n--- Init");
        String init = n1.initials("pritesh kumar pAtEl");
        System.out.println("Input  : pritesh kumar pAtEl");
        System.out.println("Output : " + n1.initials("pritesh kumar pAtEl"));
        
        System.out.println("\n--- Binary to Decimal");
        int decimal = n1.binaryToDecimal("101010");
        System.out.println("Input  : 101010");
        System.out.println("Output : " + n1.binaryToDecimal("101010"));
        
        System.out.println("\n--- Most Frequent");
        String mostFrequent = n1.mostFrequent("pritesh kumar pAtEl");
        System.out.println("Input  : pritesh kumar pAtEl");
        System.out.println("Output : " + n1.mostFrequent("pritesh kumar pAtEl"));
        mostFrequent = n1.mostFrequent("aassrrttggg desf tersgdv");
        System.out.println("Input  : aassrrttggg desf tersgdv");
        System.out.println("Output : " + n1.mostFrequent("aassrrttggg desf tersgdv"));
        
        System.out.println("\n--- Replace SubString");
        String newString = n1.replaceSubString("Lambton College in Toronto", "College", "University");
        System.out.println("Input  : Lambton College in Toronto");
        System.out.println("Output : " + n1.replaceSubString("Lambton College in Toronto", "College","University"));
    }
}
