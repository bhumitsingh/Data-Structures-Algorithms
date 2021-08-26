package com.bhumit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 489;
        arr[3] = 455;
        arr[4] = 3;
        System.out.println(arr[3]);

        // Iput using loops
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        for (int num : arr) {
//            System.out.println(num + " ");

        // Array of object
        String[] str = new String[6];
        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // Modify
        str[1] = "Bhumit";
        System.out.println(Arrays.toString(str));
        }
    }

