package com.bhumit;

import java.util.Arrays;

public class runningSumOf1D_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7};
        System.out.println(Arrays.toString(getRunningSum(arr)));
    }
    public static int[] getRunningSum(int[] arr){
        int[] runningSum = new int[arr.length];
        runningSum[0] = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            runningSum[i] = runningSum[i-1] +arr[i];
        }
        return runningSum;
    }
}
