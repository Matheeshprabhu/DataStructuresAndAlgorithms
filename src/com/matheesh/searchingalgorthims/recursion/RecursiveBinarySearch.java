package com.matheesh.searchingalgorthims.recursion;

public class RecursiveBinarySearch {

    public static int recursiveBinarySearch(int[] array, int start, int end, int element) {  // (array, p, r, x)

        if(start>end)
            return -1;
        else{
            int middle = (start+end)/2;
            if(array[middle] == element)
                return middle;
            else if(element > array[middle])
                return recursiveBinarySearch(array, middle+1, end, element);
            else
                return recursiveBinarySearch(array, start, middle-1, element);
        }


    }


    public static void main(String[] args){

        int[] array = new int[] {1,2,3,4,5,6,7,10,12,30,50};
        System.out.println(recursiveBinarySearch(array,0, array.length , 50));

    }
}
