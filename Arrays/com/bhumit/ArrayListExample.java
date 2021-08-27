package com.bhumit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(67);
//        list.add(4550);
//        list.add(610);
//        list.add(13);
//        list.add(788);
//        list.add(95);
//
//        System.out.println(list.contains(76543));
//        System.out.println(list.contains(788));
//        System.out.println(list);
//        list.set(0,88);
//        list.remove(2);
//        System.out.println(list);

        //input
        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());
        }
        //get items from any index
        for (int i = 0; i <5 ; i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        System.out.println(list);
    }
}
