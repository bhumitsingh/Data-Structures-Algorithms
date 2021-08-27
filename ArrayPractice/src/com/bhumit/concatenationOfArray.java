package com.bhumit;

import java.util.Arrays;

public class concatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 9};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] arr){
        int n = arr.length;
        int[] ans = new int[2*n];
        for (int i = 0; i <2*n ; i++) {
            ans[i] = arr[i%n];
        }
        return ans;
    }
}
