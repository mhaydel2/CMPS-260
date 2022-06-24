package com.company;
// Milan Haydel
// C00419477
// CMPS 260
// Programming Assignment : 5
// Due Date : November 19, 2020
// Program Description: Updating and maintaining code is also covered
// 			in the refactoring of the Camera and Photograph classes.
// Certificate of Authenticity:
// I certify that the code in the Main, Photograph, and Camera classes
// of this project is entirely my own work with the exception of the
// example solution to Programming Assignment #4 provided by the instructor.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		Camera log = new Camera();
		System.out.print("Enter the size of the memory card: ");
		int memorySize = input.nextInt();
		System.out.print("Enter the current date in the format YYYYMMDD: ");
		String date = input.next();
		log = new Camera(memorySize, date);
	    boolean stop = false;
	    while (!stop) {
			System.out.print("\nMain Menu\n--------------------------------------------------------------------------\n" +
					"1) Display the number of photographs\n" +
					"2) Add a randomly-generated photograph\n" +
					"3) Add a factory-generated photograph\n" +
					"4) Set the camera’s date\n" +
					"5) Display the date and size of the largest photograph\n" +
					"Q) Halt the application\n" +
					"Select a menu choice: ");
			String key = input.next();
			switch (key) {
				case "1":
					if (log.getPhotographs() > 1 || log.getPhotographs() == 0){
					System.out.println("There are " + log.getPhotographs() + " photographs in the camera.");}
					else
						System.out.println("There is " + log.getPhotographs() + " photograph in the camera.");
					break;
				case "2": // have to assign the date (Photograph) and pixel/size (Camera) separately
					System.out.print("Enter the photo's size: ");
					int size = input.nextInt();
					if (log.randomPhoto(size) == true && size > 0)
						System.out.println("(*) New photo added at position "+log.getPhotographs()+" with size "+
								log.getPixelSize(log.getPhotographs()));
					else{System.out.println("Failed to add photo");}
					break;
				case "3":
					System.out.println("Which of the following factories would you like: \n" +
							"a) All 255’s\n" +
							"b) Minimum\n" +
							"c) Checkerboard");
					String ref = input.next();
					switch (ref) {
						case "a":
							Photograph all = Photograph.createAll255sPhotograph();
							if (log.addPhoto(all) == true){
								System.out.println("(*) New photo added at position "+log.getPhotographs()+" with size "+all.getSize());}
							else{System.out.println("Failed to add photo");}
							break;
						case "b":
							Photograph min = Photograph.createMinimumPhotograph();
							if (log.addPhoto(min) == true)
								System.out.println("(*) New photo added at position "+log.getPhotographs()+" with size "+min.getSize());
							else System.out.println("Failed to add photo");
							break;
						case "c":
							Photograph checker = Photograph.create7x7Checkerboard();
							if (log.addPhoto(checker) == true){
								System.out.println("(*) New photo added at position "+log.getPhotographs()+" with size "+checker.getSize());}
							else{System.out.println("Failed to add photo");}
							break;
						default:
							System.out.println("Unrecognized input, try again.\n");
							break;
					}
					break;
				case "4":
					System.out.print("Enter the current date in the format YYYYMMDD: ");
					String newDate = input.next();
					log.setDate(newDate);
					break;
				case "5":
					int pos=0;
					double largest=log.getPixelSize(0);
					for(int i=1; i<=log.getPhotographs(); i++) {
						if (largest < log.getPixelSize(i)) {
							largest = log.getPixelSize(i);
							pos = i;
						}
					}
					System.out.println("\nLargest Photograph:\n" +
							"Date: " + log.getDate(pos) +
							"\nSize: " + log.getPixelSize(pos));
					break;
				case "Q":
					stop = true;
					break;
				default:
					System.out.println("Unrecognized input, try again.\n");
					break;
			}
		}
    }
}
