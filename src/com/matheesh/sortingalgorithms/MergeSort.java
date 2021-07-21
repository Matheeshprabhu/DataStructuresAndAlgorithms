package com.matheesh.sortingalgorithms;

public class MergeSort {

    public static void mergeSort(int[] array){

        mergeSort(array, 0, array.length-1);

    }

    private static void mergeSort(int[] array, int start, int end){

        if(end<=start){
            return;
        }

        int mid = (start + end)/2;
        mergeSort(array, start, mid);
        mergeSort(array, mid+1, end);
        merge(array, start, mid, end);

    }

    public static void merge(int[] array, int start, int mid, int end){

        int leftSlot = start;
        int rightSlot = mid+1;
        int k = 0;

        int[] tempArray = new int[end-start + 1];

        while(leftSlot<=mid && rightSlot <= end){

            if(array[leftSlot] < array[rightSlot]){
                tempArray[k] = array[leftSlot];
                leftSlot++;
            }else if(array[rightSlot] < array[leftSlot]){
                tempArray[k] = array[rightSlot];
                rightSlot++;
            }
            k++;
        }

        if(leftSlot<=mid){
            while(leftSlot<=mid){
                tempArray[k] = array[leftSlot];
                leftSlot++;
                k++;
            }
        }

        if(rightSlot<=end){
            while(rightSlot<=end){
                tempArray[k] = array[rightSlot];
                rightSlot++;
                k++;
            }
        }

        for(int i = 0; i< tempArray.length; i++){
            array[start+i] = tempArray[i];
        }

    }

    public static void main(String[] args){

        int[] myArray = new int[] {3,10,20,40,45,55,1,2,8,44,51,54};
        mergeSort(myArray);

        for(int item : myArray){
            System.out.print(item + " ");
        }
    }
}
