package com.matheesh.sortingalgorithms;

public class QuickSort {

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length-1);
    }

    public static void quickSort(int[] array, int start, int end){
        if(start>=end)
            return;
        int mid;
        mid = partition(array, start, end);
        quickSort(array, start, mid-1);
        quickSort(array, mid+1, end);

    }

    public static int partition(int[] array, int start, int end){

        int pivot = array[end];
        int i = start - 1;
        int temp;

        for(int j = start; j<= end-1; j++){

            if(array[j] <= pivot){
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        temp = array[i+1];
        array[i+1] = array[end];
        array[end] = temp;

        return i+1;
    }

    public static void main(String[] args){

        int[] myArray = new int[] {3,10,20,40,45,55,1,2,8,44,51,54};
        quickSort(myArray);

        for(int item : myArray){
            System.out.print(item + " ");
        }
    }
}
