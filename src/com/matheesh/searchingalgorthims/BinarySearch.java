package com.matheesh.searchingalgorthims;

public class BinarySearch {

    public static int search(int[] array, int element) {

        int p = 0;
        int q;
        int r = array.length;

        while (p <= r) {
            q = (p + r) / 2;

            if (element == array[q])
                return q;
            if (element > array[q]) {
                p = q;
            } else {
                r = q;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] array = {11, 33, 41, 12, 134, 100};
        System.out.println("Index position of the element is --> " + BinarySearch.search(array, 12));
    }

}
