// Milan Haydel
// C00419477
// CMPS 260
// Programming Assignment : 3
// Due Date : October 21,2020 Wednesday
// Program Description: This assignment collects the topics from the last two programming assignment
// and includes the most recently covered topics: methods and arrays.
// Certificate of Authenticity:
// I certify that the code in the method function main of this project is entirely my own work.
package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        loop();

        System.out.print("\nEnter a value for a: ");
        float a = input.nextFloat();
        System.out.print("Enter a value for b: ");
        float b = input.nextFloat();
        System.out.print("Enter a value for c: ");
        float c = input.nextFloat();
        float[] x = new float[3];
        x[0]=(a);
        x[1]=(b);
        x[2]=(c);
        float[] answer = quadratic(x);
        System.out.println("The roots are " + answer[0] + " and " + answer[1]);


        System.out.print("\n\nEnter three words: ");
        String one = input.next();
        String two = input.next();
        String three = input.next();
        String[] words = {one, two, three};
        strings(words);


        System.out.print("\n\nEnter a word: ");
        String option = input.next();
        System.out.print(method4(option));
        while (option.length() != 10){
            System.out.print("\n\nEnter a word: ");
            option = input.next();
            System.out.print(method4(option));
        }

    }

    public static void loop() {
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + ": All work and no play makes Jack a dull boy.");
        }
    }

    public static float[] quadratic(float[] x) {
        float[] answer = {0, 0};
        double discriminant = (Math.pow(x[1], 2)) - (4 * x[0] * x[2]);
        if (discriminant > 0) {
            answer[0] = (float) ((-x[1] + (Math.sqrt(discriminant))) / (2 * x[0]));
            answer[1] = (float) ((-x[1] - (Math.sqrt(discriminant))) / (2 * x[0]));
        }
        return answer;
    }

    public static void strings(String[] words){
        Arrays.sort(words, Collections.reverseOrder());
        for (int i=0; i<3; i++) {
            System.out.println(words[i]);
        }
    }

    public static String method4(String option) {
        if (option.length() < 10) {
            return "too small";
        }
        else if (option.length() > 10) {
            return "too big";
        }
        else {
            return "just right";
        }
    }

}

