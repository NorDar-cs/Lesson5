package task4;

import java.util.Arrays;

/**
 * Написать функцию linearize, которая принимает в качестве
 * параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами
 * двумерного.
 */

public class CS4 {
    public static void main(String[] args) {
        int[][] startArray = {
                {2, 4, 6, 3},
                {4, 6, 7, 9},
                {8, 8, 8}
        };

        int[] result = linearize(startArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] linearize(int[][] startArray) {
        int[] result = new int[findLength(startArray)];
        int counter = 0;
        for (int i = 0; i < startArray.length; i++) {
            int[] array = startArray[i];
            for (int j = 0; j < array.length; j++) {
                result[counter] = array[j];
                counter++;
            }
        }
        return result;
    }

    public static int findLength(int[][] startArray) {
        int counterLength = 0;
        for (int i = 0; i < startArray.length; i++) {
            int[] array = startArray[i];
            for (int j = 0; j < array.length; j++) {
                counterLength++;
            }
        }
        return counterLength;
    }
}

