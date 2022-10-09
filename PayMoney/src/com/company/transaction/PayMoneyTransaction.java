package com.company.transaction;

import java.util.Scanner;

public class PayMoneyTransaction {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the size of transaction array: ");

		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the values of array: ");

		for (int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the total no of targets that needs to be achieved: ");

		int targetNo = sc.nextInt();

		if (targetNo !=0) {
			boolean condition =true;

			while(condition) {
				int flag = 0;

				System.out.print("Enter the value of target: ");

				int target = sc.nextInt();
				int sum = 0;

				for(int i = 0; i < size; i++){
					sum += arr[i];
					if (sum >= target){
						System.out.println("Target achieved after "+(i+1)+" transactions. \n");
						flag = 1;
						break;

					}
				}
				if (flag ==0){
					System.out.println("Given target is not achieved. \n");
				}

				System.out.print("Press 1 to continue or press 0 to exit: ");

				int choice = sc.nextInt();
				switch(choice) {

				case 0:
					condition = false;
					break;
				case 1:
					condition = true;
					break;
				}
			} if(condition == false) {
				System.out.println("Run programme to start again...........");
			}
		}
		else {
			System.out.println("No target set......\nRun programme to start again...........");
		}
		sc.close();
	}

}