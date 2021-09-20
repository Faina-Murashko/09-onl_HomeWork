package com.lesson2.Homework2;
import java.util.Arrays;
public class Numbers {
    public void testNumbers() {
        int array1[] = new int[]{7, 4, -1, 21, 9};
        boolean Sort = false;
        int num;
        while (Sort) {
            Sort = true;
            for (int i = 0; i < array1.length - 1; i++) {
                if (array1[i] > array1[i + 1]) {
                    Sort = false;
                    num = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = num;
                }

            }
        }
        System.out.println(Arrays.toString(array1));

    }
}

