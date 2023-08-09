package com.linearDS.types;
import java.util.*;


/*
import java.util.*;
class RecursiveBinary{  
 public static void main(String args[]){  
    int numArray[] = {5,10,15,20,25,30,35}; 
    System.out.println("The input array: " + Arrays.toString(numArray));
    int key = 20;
    System.out.println("\nKey to be searched=" + key);   
    int first = 0;
    int last=numArray.length-1; 
    int mid = (first + last)/2;  
    while( first <= last ){  
        if ( numArray[mid] < key ){  
            first = mid + 1;     
        }else if ( numArray[mid] == key ){ 
            System.out.println("Element is found at index: " + mid);  
            break;  
        }else{  
            last = mid - 1;  
        }  
        mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }       
 }  
}  

*/



class RecursiveBinary{  
    //recursive method for binary search
    public static int binary_Search(int intArray[], int low, int high, int key){  
        //if array is in order then perform binary search on the array
        if (high>=low)
        {  
            //calculate mid
            int mid = low + (high - low)/2;  
            //if key =intArray[mid] return mid
            if (intArray[mid] == key)
            {  
            return mid;  
            }  
            //if intArray[mid] > key then key is in left half of array
            if (intArray[mid] > key)
            {  
                return binary_Search(intArray, low, mid-1, key);//recursively search for key  
            }
            else       //key is in right half of the array
            {  
                return binary_Search(intArray, mid+1, high, key);//recursively search for key 
            }  
        }  
        return -1;  
    }
        public static void main(String args[]){  
        //define array and key
        int intArray[] = {1,11,21,31,41,51,61,71,81,91}; 
        System.out.println("Input List: " + Arrays.toString(intArray));
        int key = 31;  
        System.out.println("\nThe key to be searched:" + key);
        int high=intArray.length-1;
        //call binary search method 
        int result = binary_Search(intArray,0,high,key);  
        //print the result
        if (result == -1)  
            System.out.println("\nKey not found in given list!");  
        else 
            System.out.println("\nKey is found at location: "+result + " in the list");  
    }  
}








/*

import java.util.Arrays;  
class RecursiveBinary{  
    public static void main(String args[]){  
        //define an array
        //int intArray[] = {10,20,30,40,50,60,70,80,90};
        int intArray[] = {30,40,1,22,4,50,10,20,60,70,80,90};
        System.out.println("The input Array : " + Arrays.toString(intArray));
        //define the key to be searched
        int key = 90;  
        System.out.println("\nThe key to be searched:" + key);
        //call binarySearch method on the given array with key to be searched
        int result = Arrays.binarySearch(intArray,key);  
        //print the return result
        if (result < 0)  
            System.out.println("\nKey is not found in the array!");  
        else 
            System.out.println("\nKey is found at index: "+result + " in the array.");  
    }  
}  

*/
