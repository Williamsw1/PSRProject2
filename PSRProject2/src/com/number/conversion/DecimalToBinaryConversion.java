package com.number.conversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinaryConversion {

	public static void decimalToBinary(int num) {
		int arr[] = new int[20];
		int count = 0;
		while (num > 0) {
			arr[count++] = num % 2;

			num = num / 2;
		}
		for (int i = count - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");

		int num = Integer.parseInt(buff.readLine());
		decimalToBinary(num);

	}

}
