package task2;

import com.sun.source.tree.LiteralTree;

import java.util.Arrays;

/**
 * 2. Написать программу, удаляющую все повторяющиеся целые
 числа из массива и печатающую результат. Массив должен
 использоваться тот же самый. На место удаленных элементов
 ставить цифру 0.
 */
public class CS2 {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 4, 5, 5, 5, 18};
        for (int i = 0; i < array.length; i++) {
            array = pasteZero(array, i);
        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] pasteZero(int[] array, int i) {
        for (int counter = 1; counter + i < array.length; counter++) {
            if (array[i] != array[i + counter]) {
                array[counter + i] = array[counter + i];
            } else {
                array[counter + i] = 0;
            }
        }
        return array;
    }
}
