// Milan Haydel
// C00419477
// CMPS 260
// Programming Assignment : 2
// Due Date : Sept 21, 2020
// Program Description: This program will ask the user for a name, age,
//      and driver's test score. The program will display whether the
//      age and test score are valid to vote and receive a a driver's
//      license.
// Certificate of Authenticity:
// I certify that the code in method function main of this project is
// entirely my own work.

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = "Yes";
        while (answer.equals("Yes")) {

            System.out.print("Enter a name: ");
            String nameF = input.next();
            String nameL = input.next();

            System.out.print("Enter an age: ");
            int age = input.nextInt();
            while (age < 0) {
                System.out.print("Invalid value entered.\nEnter an age: ");
                age = input.nextInt();
            }

            System.out.print("Enter a driver's test score: ");
            int score = input.nextInt();
            while (score < 0 || score > 40) {
                System.out.print("Invalid value entered.\nEnter a driver's test score: ");
                score = input.nextInt();
            }

            if (score >= 32) {
                if (age == 15 || age == 16) {
                    System.out.println(nameF + " " + nameL + " can drive with a learner's permit and is not eligible to vote.");
                }
                else if (age == 17) {
                    System.out.println(nameF + " " + nameL + " can drive with a full license and is not eligible to vote.");
                }
                else if (age >= 18) {
                    System.out.println(nameF + " " + nameL + " can drive with a full license and is eligible to vote.");
                }
                else {
                    System.out.println(nameF + " " + nameL + " can not drive and is not eligible to vote.");
                }
            }
            else {
                if (age >= 18) {
                    System.out.println(nameF + " " + nameL + " can not drive and is eligible to vote.");
                }
                else {
                    System.out.println(nameF + " " + nameL + " can not drive and is not eligible to vote.");
                }
            }
                System.out.print("Would you like to continue (Yes or No)? ");
                answer = input.next();
                System.out.println();
        }
    }
}