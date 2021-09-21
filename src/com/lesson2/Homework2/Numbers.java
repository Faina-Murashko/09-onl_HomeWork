package com.lesson2.Homework2;
import java.util.Arrays;
public class Numbers {
    public void testNumbers() {

        int[] array1 = new int[]{7, 4, -1, 21, 9};
        boolean Sort = false;

        for (int j = 0; j < array1.length; j++){
            for (int i = 0; i < array1.length -1 - j; i = i + 1){
                int max = array1[i];
                if (max > array1[i + 1]){
                    array1[i] = array1 [ i + 1];
                    array1 [i + 1] = max;
                }

            }
        }
        System.out.println(Arrays.toString(array1));

    }
}

