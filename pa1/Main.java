// Milan Haydel
// C00419477
// CMPS 260
// Programming Assignment : 1
// Due Date : Sept 8, 2020
// Program Description: This program will ask the user to input how many pounds (lbs) to order for 3 different types
//      of flour : All-Purpose, Whole-Wheat, and Bread. The program will then calculate the price of the total order.
// Certificate of Authenticity: (choose one from below)
// I certify that the code in the method function main of this project // is entirely my own work.
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many pounds of All-Purpose Flour to order (>=0): ");
        double allPurpose = input.nextDouble();
        double allPurposePrice = allPurpose * 2;

        System.out.print("Enter how many pounds of Whole-Wheat Flour to order (>=0): ");
        double wholeWheat = input.nextDouble();
        double wholeWheatPrice = wholeWheat * 4.25;

        System.out.print("Enter how many pounds of Bread Flour to order (>=0): ");
        double bread = input.nextDouble();
        double breadPrice = bread * 2.5;

        System.out.print("Enter the order ID: ");
        String order = input.next();

        System.out.print("Enter the customer's name: ");
        String name = input.next();

        double total = allPurposePrice + wholeWheatPrice + breadPrice;

        System.out.printf("\nTotal price of order " + order + " for " + name + " is $" + "%5.2f", total);

    }
}
