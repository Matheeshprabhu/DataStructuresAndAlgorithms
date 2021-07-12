package com.matheesh.searchingalgorthims.recursion;

public class RecursiveLinearSearch {

    public static int recursiveLinearSearch(int[] array, int i, int x) {

        if (i >= array.length) {
            return -1;
        }
        else if(array[i] == x){
            return i;
        }
        else{
            return recursiveLinearSearch(array, i+1, x);
        }

    }

    public static void main(String[] args) {

        System.out.println(recursiveLinearSearch(new int[] {1,2,3,4,5,6,7}, 0, 9));
    }
}
