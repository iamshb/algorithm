package com.shinshin.algorithm.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] intArray = {20, 75, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int index = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[index++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input,start + index, mid - i);
        System.arraycopy(temp, 0, input, start, index);

//        System.out.println("# start: " + start + ", mid: " + mid + ", end: " + end);
//        System.out.println("# i: " + i +  ", j: " + j + ", index: " + index);
//        for (int each : input) {
//            System.out.print(each + ", ");
//        }
//        System.out.println("..");
//        System.out.println("# end");
    }
}
