package com.matheesh.sortingalgorithms;

import org.jetbrains.annotations.Contract;

public class InsertionSort {


    public static int[] insertionSort(int[] array){

        for(int i = 1; i<array.length; i++){

            int key = array[i];
            int j = i-1;

            while(j>=0 && array[j]>key){

                array[j+1] = array[j];
                j--;
            }

            array[j+1] = key;

        }

        return array;

    }

    public static void main(String[] args){


        int[] array = insertionSort(new int[] {50, 10, 2, 7, 9});

        for(int item : array){
            System.out.print(item + " ");
        }

    }
}
