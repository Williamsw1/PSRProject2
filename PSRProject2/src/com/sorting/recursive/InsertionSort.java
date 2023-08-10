package com.sorting.recursive;

import java.util.*;
public class InsertionSort {  
public static void main(String[] args) {  
    
    int[] numArray = {10,6,15,4,1,45};  
    System.out.println("Original Array:" + Arrays.toString(numArray));
    
    for(int k=1; k<numArray.length-1; k++)   {  
        int temp = numArray[k];  
        int j= k-1;  
        while(j>=0 && temp <= numArray[j])   {  
            numArray[j+1] = numArray[j];   
            j = j-1;  
        }  
        numArray[j+1] = temp;  
    }  
    //print the sorted array
    System.out.println("Sorted Array:" + Arrays.toString(numArray));
}  
}  
