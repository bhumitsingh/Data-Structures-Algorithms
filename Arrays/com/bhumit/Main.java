package com.bhumit;

public class Main {

    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 19;
        // Q: Store a name
        String name = "Bhumit";
        //Q: Store 5 roll numbers:
        //First Method(Tedious Method):
        int rno1 = 12;
        int rno2 = 15;
        int rno3 = 19;
        int rno4 = 10;
        int rno5 = 9;
        //Second Method(Arrays):
        int[] rnos = new int[5];
        rnos[0] = 12;
        rnos[1] = 15;
        rnos[2] = 19;
        rnos[3] = 10;
        rnos[4] = 9;
        // syntax
        // datatype[] variable_name = new datatype[size];
        // then add elements to the array.
        // or directly
        // int[] rnos = {12,15,19,10,9}

        int[] ros; // declaration of array : ros is getting defined in stack
        ros = new int[5]; // initialisation : actually hee object is being created in the memory (heap).
        System.out.println(rnos[0]);
        System.out.println(rnos[1]);
        System.out.println(rnos[2]);
        System.out.println(rnos[3]);
        System.out.println(rnos[4]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

    }
}
