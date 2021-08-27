package com.bhumit;

import java.util.Arrays;

public class buildArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(Solution(arr)));
    }
    public static int[] Solution(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
