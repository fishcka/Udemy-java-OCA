package lesson_18;

import java.util.Arrays;

public class SortArray {
    public static int[] arraySorting(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {8, -3, 6, 12, -7, -1, 5};
        int[] array2 = {0, 18, -9, 1, 3, 0, -11, -15, 13};

        System.out.println(Arrays.toString(arraySorting(array1)));
        System.out.println(Arrays.toString(arraySorting(array2)));
    }
}

/*
output:
        [-7, -3, -1, 5, 6, 8, 12]
        [-15, -11, -9, 0, 0, 1, 3, 13, 18] */
