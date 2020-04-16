package task1;

import java.util.Arrays;

/**
 * Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию,
 * и печатает результат.
 * Цикличность означает, что последний элемент массива становится самым первым его элементом.
 */

public class CS1 {
    public static void main(String[] args) {
        //               0  1  2  3  4
        int[] array = {1, 4, 6, 8, 18};
        int newArray[] = new int[array.length];
        newArray = resultArray(array, newArray);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] resultArray(int[] array, int[] newArray) {
        int i = 0;
        while (i < array.length - 1) {
            newArray[i + 1] = array[i];
            i++;
        }
        if (i == array.length - 1) {
            newArray[0] = array[i];
        }
        return newArray;
    }
}
