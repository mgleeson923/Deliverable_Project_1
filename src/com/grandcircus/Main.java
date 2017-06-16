package com.grandcircus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* variable for user inputted number// */
        int userNum;

        /* scanner of user input// */
        Scanner scnr = new Scanner(System.in);

        /* Text explaining the purpose of the program// */
        System.out.println("Is your number an Armstrong Number?");
        System.out.println("An Armstrong Number is a number in which the sum each digit cubed is equal to the original number.");

        /* text prompting user to enter the number they wish to test// */
        System.out.println("Enter a number:");
        userNum = scnr.nextInt();


        /* variable from separate method that checks against userNum for True/False// */
        int sum = getSum(userNum);

            /* prompt to tell the user what the program is doing with the inputted number// */
            System.out.println("Is your number an Armstrong Number?");

            /* result that is printed if the number is Armstrong Number// */
            if (sum == userNum)
            {
                System.out.println("True");
            }

            /* result printed if number is NOT Armstrong Number// */
            else
            {
                System.out.println("False");
            }
        }

        /* method performing the task of breaking down the number// */
    private static int getSum(int userNum) {
        int copyOfNumber = userNum;
        int noOfDigits = String.valueOf(userNum).length();
        int sum = 0;

        /* loop that breaks each digit down, cubes it, and divides until copyofNumber is 0// */
        while (copyOfNumber != 0)
            {
                int lastDigit = copyOfNumber % 10;
                int lastDigitToThePowerOfNoOfDigits = 1;
                for(int i = 0; i < noOfDigits; i++) {
                    lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
                }

                sum = sum + lastDigitToThePowerOfNoOfDigits;
                copyOfNumber = copyOfNumber / 10;
            }
        return sum;
    }

}
