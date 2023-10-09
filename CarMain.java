package com.carrent.book.main;

import java.util.Scanner;

import com.carrent.book.cars.Cars;
import com.carrent.book.operations.CarOperations;

public class CarMain {
 
	public static void main(String[] args) {
		
	boolean b = true;
	CarOperations carOperations = new CarOperations();
	while(b)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("==============================WELCOME TO CAR DEKHO APPLICATION==============================");
		System.out.println("1.ADD NEW CAR DETAILS");
		System.out.println("2.SHOW CAR DETAILS");
		System.out.println("3.UPDATE THE CAR DETAILS");
		System.out.println("4.SHOW  ALL CAR DETAILS");
		System.out.println("5.REMOVE THE ADDED CAR DETAILS");
		System.out.println("6. EXIT THE APPLICATION");
		System.out.println("ENTER NUMBER OF OPERATION THAT YOU WANT TO PERFORM");
		//System.out.println();
		System.out.println("============================================================================================");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
		{
			carOperations.add();
			break;
		}
		case 2:
		{
			carOperations.details();
			
			break;
		}
		case 3 :
		{
			carOperations.update();
			break;
		}
		case 4 :
		{
			carOperations.show(scanner);
			break;
		}
		case 5 :
		{
			carOperations.remove(scanner);
			break;
		}
		case 6:
		{
			System.out.println("THANK YOU FOR VISITING APPLICATION");
			b = false;
			break;
		}
			
		}
	}
		
	}
}

