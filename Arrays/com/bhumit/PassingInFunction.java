package com.bhumit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5 ,6};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
