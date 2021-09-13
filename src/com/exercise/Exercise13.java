/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise13{
    public static void main(String[] args) {
        double rate;
        Scanner scan = new Scanner(System.in);
        //Here we first take in the input from a user
        System.out.print("What is the principal amount? ");
        double principal = scan.nextDouble();;
        System.out.print("What is the rate? ");
        rate = scan.nextDouble();
        System.out.print("What is the number of years? ");
        double years = scan.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        double compoundedYearly = scan.nextInt();
        //Here we divide the interest by 100, as it was entered as ex (4.2) instead of the needed (.042)
        double newInterest = rate/100;
        //Here we use the mathematical equation given to us to determine our total investment.
        double compoundInterest = principal*Math.pow((1 + newInterest/compoundedYearly),(compoundedYearly*years));
        double roundUpCents = Math.round(compoundInterest * 100.0) / 100.0;
        //Now we print our results to the screen after calculating.
        System.out.println("$" + (principal) + " invested at " + rate + "% for " + years + " years compounded " + compoundedYearly + " times per year is $" +  roundUpCents + ".");
    }
}


