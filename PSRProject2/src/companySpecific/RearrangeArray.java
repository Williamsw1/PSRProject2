package companySpecific;

import java.util.Scanner;

public class RearrangeArray {

    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

   
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { 
                    swap(arr, j, j + 1);
                }
            }
        }
    }

   
    private static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int start = 0;
        int end = n - 1;
        int index = 0;

        while (start < end) {
            temp[index++] = arr[start++];
            temp[index++] = arr[end--];
        }

        if (n % 2 != 0) {
            temp[index] = arr[start];
        }

       
        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integers or a string: ");
        String inputStr = scanner.nextLine().trim();

        int[] arr;

        boolean isIntegerArray = false;
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == ' ') {
                isIntegerArray = true;
                break;
            }
        }

        if (isIntegerArray) {
           
            String[] tokens = inputStr.split(" ");
            int n = tokens.length;
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }
        } else {
            
            int n = inputStr.length();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (Character.isDigit(inputStr.charAt(i))) {
                    arr[i] = inputStr.charAt(i) - '0';
                }
            }
        }

        bubbleSort(arr);
        rearrangeArray(arr);

        System.out.print("Output: ");
        if (isIntegerArray) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(" ");
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
}



/*
Given an array of N integes, rearrange the array in such a way that the
first element is first maximum,second element is first minimum,third
element is second maximum,fourth element is second minimum and so on .
input format - The first line contains the value of the N integers
separated bu one or more spaces. Boundary conditions:4<=N<=100 output
Format: The N numbers alternately sorted as per the given
instructions. Example input/output 1: input: 1234567 output: 7162534
example input 2 - 10 99 44 22 56 63 output: 99 10 63 22 56 44 input
9569325 output 9293655 maximum execution time limit: 5000 millisecs .
Test case- note:input: 1234567 if input is not having the space for
the above input value then also the program must give perfect output
by giving space allocation for int array produce output in java program .

*/

