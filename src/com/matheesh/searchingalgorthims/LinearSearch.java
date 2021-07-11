package com.matheesh.searchingalgorthims;

public class LinearSearch {

    public static int search(int[] ar, int element){

        for(int i = 0; i<ar.length; i++){
            if(ar[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int[] array = {11, 33, 41, 12, 134, 100};

        System.out.println("Index position of the element is --> " + LinearSearch.search(array, 134));
    }
}
