/*
Author: Aaron Ofengender
Date: November 9th, 2017
Purpose: Practicing the basics of java programming
*/

public class basics {
    public static void main(String[] args) {
        int[] newArray = {8, 6, 9, 10, 5, 2, 7, 3, 4, 1};
        bubbleSort(newArray);
        reverseSort(newArray);
        
    }

    public static void bubbleSort(int[] array1) {
        int x;
        for (int i = 0; i < array1.length; i++) {
            for (int j = i+1; j < array1.length; j++) {
                if (array1[i] > array1[j]) {
                    x = array1[j];
                    array1[j] = array1[i];
                    array1[i] = x;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(array1));
    }
    
    public static void reverseSort(int[] array1) {
        int x;
        for (int i = 0; i < array1.length; i++) {
            for (int j = i+1; j < array1.length; j++) {
                if (array1[i] < array1[j]) {
                    x = array1[j];
                    array1[j] = array1[i];
                    array1[i] = x;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(array1));
    }
}