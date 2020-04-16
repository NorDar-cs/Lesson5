package task3;

import java.util.Arrays;

/**
 * Заданы 2 массива целых чисел произвольной длины. 
 *     Написать программу, создающую третий массив,
 * представляющий собой слияние 2-х заданных.
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
public class CS3 {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {5, 6, 7,};
        int[] thirdArray = new int[firstArray.length + secondArray.length];
        if (findLongest(firstArray, secondArray)) {
            thirdArray = createThirdArrayIfFirstLongerOrEqual(firstArray, secondArray, thirdArray);
        } else {
            thirdArray = createThirdArrayIfSecondLonger(firstArray, secondArray, thirdArray);
        }
        System.out.println(Arrays.toString(thirdArray));
    }

    public static int[] createThirdArrayIfFirstLongerOrEqual(int[] firstArray, int[] secondArray, int[] thirdArray) {
        int i = 0;
        int in = 0;
        while (i < thirdArray.length) {
            while (in < secondArray.length) {
                thirdArray[i] = firstArray[in];
                i++;
                thirdArray[i] = secondArray[in];
                i++;
                in++;
            }
            if (in < firstArray.length && in >= secondArray.length) {
                thirdArray[i] = firstArray[in];
                i++;
                in++;
            }
        }
        return thirdArray;
    }

    public static int[] createThirdArrayIfSecondLonger(int[] firstArray, int[] secondArray, int[] thirdArray) {
        int i = 0;
        int in = 0;
        while (i < thirdArray.length) {
            while (in < firstArray.length) {
                thirdArray[i] = firstArray[in];
                i++;
                thirdArray[i] = secondArray[in];
                i++;
                in++;
            }
            thirdArray[i] = secondArray[in];
            i++;
            in++;
        }
        return thirdArray;
    }

    public static boolean findLongest(int[] firstArray, int[] secondArray) {
        if (firstArray.length >= secondArray.length) {
            return true;
        } else {
            return false;
        }
    }
}
