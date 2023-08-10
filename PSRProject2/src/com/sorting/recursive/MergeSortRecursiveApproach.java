package com.sorting.recursive;


import java.util.Arrays;

public class MergeSortRecursiveApproach {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            System.out.println("checking");
            int mid = left + (right - left) / 2;
            System.out.println("after left merge"+Arrays.toString(arr)+" "+left+" "+mid);
            mergeSort(arr, left, mid);
            System.out.println("hai");
            System.out.println("hai merge"+Arrays.toString(arr)+" "+right+" "+mid);
            System.out.println("bai");
            mergeSort(arr, mid + 1, right);
            System.out.println("merge part"+Arrays.toString(arr)+" "+left+" "+mid+" "+right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {60,55,50,45,40,39,42,53,49,38,2,1,7,52};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

