package com.dest.arrayprogrammes;

public class CheckSort {
    public static void main(String[] args) {
        
        int[] ascendingArr = {11, 22, 33, 44, 55};
        int[] descendingArr = {90, 75, 60, 45, 30};
        int[] unsortedArr = {11, 22, 10, 44, 55};

        
        System.out.println("Is ascendingArr sorted? " + checkSorted(ascendingArr));
        System.out.println("Is descendingArr sorted? " + checkSorted(descendingArr));
        System.out.println("Is unsortedArr sorted? " + checkSorted(unsortedArr));
    }

    
    public static String checkSorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                ascending = false;  
            }
            if (arr[i] > arr[i - 1]) {
                descending = false; 
            }
        }

        
        if (ascending) {
            return "Ascending";
        } else if (descending) {
            return "Descending";
        } else {
            return "Not sorted";
        }
    }
}
