package com.lesson2.Homework2;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class min_max {
    public void sort2(){
        int [] arr = {13, 21, 31, 77, -1, 11};
        for ( int i = 0; i < arr.length -1; i = i + 1 ){
            int max = arr[i];
            if (max > arr[ i + 1]){
                arr[i] = arr[i + 1];
                arr[i + 1] = max;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
