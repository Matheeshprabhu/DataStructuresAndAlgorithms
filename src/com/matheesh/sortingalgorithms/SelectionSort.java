package com.matheesh.sortingalgorithms;

public class SelectionSort {

    // Complexity --> O(n^2)
    public static int[] selectionSort(int[] array){

        for(int i = 0; i<array.length; i++){

            int minimum = i;
            for(int j = i + 1; j<array.length; j++){

                if(array[minimum] > array[j])
                    minimum = j;
            }

            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }

        return array;

    }

    public static void main(String[] args){


        int[] array = SelectionSort.selectionSort(new int[] {34,11,22,10,7,8,1});

        for(int item : array){
            System.out.print(item + " ");
        }

    }
}
