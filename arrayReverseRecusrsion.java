package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class arrayReverseRecusrsion {
    
    //Method for recursive call
    public static void rev(int[] arr, int l, int n) {

        if (l >= n / 2)
            return;
        swap(arr, l, n - l - 1);
        rev(arr, l + 1, n);
    }
    
    //Method for swapping element
    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    
    //Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int l = 0;
        int n = arr.length;
        rev(arr, l, n);
        System.out.println(Arrays.toString(arr));
    }
}
