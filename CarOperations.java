package com.carrent.book.operations;

import java.util.ArrayList;
import java.util.Scanner;

import com.carrent.book.cars.Cars;

public class CarOperations {
	ArrayList<Cars> arrayList = new ArrayList<Cars>();

	public void add()
	{
		Scanner scanner = new Scanner(System.in);
		Cars cars = new Cars();
		System.out.println("PLEASE ENTER CAR_ID");
		cars.setCar_id(scanner.nextInt());
		scanner.nextLine();
		System.out.println("PLEASE ENTER CAR_NAME");
		cars.setCar_name(scanner.next());
		scanner.nextLine();
		System.out.println("PLEASE ENTER CAR_BRAND");
		cars.setCar_brand(scanner.next());
		scanner.nextLine();
		System.out.println("PLEASE ENTER CAR_PRICE");
		cars.setCar_price(scanner.nextLong());
		arrayList.add(cars);
		System.out.println("THE CAR ADDED SUCCESSFULLY");
	}
	public void remove(Scanner scanner)
	{
		arrayList.removeAll(arrayList);
		System.out.println("YOU HAVE REMOVED CAR DETAILS SUCCESSFULLY");
		System.out.println(arrayList);
	}
	public void show(Scanner scanner)
	{
		if (arrayList.isEmpty()) {
			System.out.println("YOU HAVEN'T ADDED ANY CAR PLEASE ADD NEW CAR DETAILS");
		}
		else {
			System.out.println("THE DETAILS OF CAR ARE SHOWN BELOW");
			System.out.println(arrayList);
		}
	}
	public void details()
	{
		for (Cars cars : arrayList) {
			System.out.println(cars.toString());
		}
	}
	public void update()
	{
	if (arrayList.isEmpty()) {
		System.out.println("PLEASE ADD CAR DETAILS");
	}
	else {
		Scanner scanner= new Scanner(System.in);
		System.out.println("TO UPDATE CAR DETAILS SELECT THE OPTION");
		System.out.println("1.UPDATE THE CAR_ID");
		System.out.println("2.UPDATE  THE CAR_NAME");
		System.out.println("3.UPDATE THE CAR_BRAND");
		System.out.println("4.UPDATE THE CAR_PRICE");
		System.out.println("5.EXIT ");
		System.out.println("ENTER NUMBER OF OPERATION THAT YOU WANT TO PERFORM");
		System.out.println("============================================================================================");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
		{
			for (Cars cars : arrayList) {
				System.out.println("ENTER THE OLD CAR_ID");
				int oldcar_id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("ENTER THE NEW CAR_ID");
				int newcar_id = scanner.nextInt();
				if (cars.getCar_id()== oldcar_id) {
					cars.setCar_id(newcar_id);
				}
			}
			System.out.println("THE CAR_ID IS UPDATED SUCCESSFULLY");
			break;
		}
		case 2:
		{
			for (Cars cars : arrayList) {
				System.out.println("ENTER THE CAR_ID TO UPDATE CAR_NAME");
				int oldcar_id = scanner.nextInt();
				scanner.nextLine();
				if (cars.getCar_id()==oldcar_id) {
					System.out.println("ENTER THE NEW CAR_NAME");
					String newcar_name = scanner.next();
					if (cars.getCar_id()==oldcar_id) {
						cars.setCar_name(newcar_name);
					}
				}
				else
				{
					System.out.println("ENTER THE CORRECT CAR_ID");
				}	
			}
			System.out.println("THE CAR_NAME IS UPDATED SUCCESSFULLY");
			break;
		}
		case 5:
		{
			break;
		}
		}
	}
		
	}
	
	}

