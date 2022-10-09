package com.company.transaction;

import java.util.Scanner;

public class CurrencyDenomination {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the size of currency denomination: ");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.print("Enter the currency denominatios values: ");

		for (int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i<arr.length-1; i++){

			for(int j = 0; j < arr.length-1-i; j++){

				if(arr[j]<arr[j+1]){

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		System.out.print("Enter the amount you want to pay: ");

		int amount = sc.nextInt();

		System.out.println("\nPayment approach in order to give minimun numbers of notes will be: ");

		for(int i = 0; i < size; i++){

			int no = amount/arr[i];
			if (no !=0) {
				System.out.println(arr[i]+" --> "+ (amount/arr[i]));
			}
			amount = amount%arr[i];

		}

		sc.close();

	}

}
