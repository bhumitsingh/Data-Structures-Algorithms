package com.bhumit;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,1,1,1,1,0,0,1,1,0,1,1};
        System.out.println(maxOnes(arr));
    }
    public static int maxOnes(int[] arr){
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==1){
                cnt++;
            }
            else{
                cnt = 0;
            }
            ans = Math.max(ans,cnt);
        }
        return ans;
    }
}
