package com.Antrikos.HomeWork1_1_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Avtpikoc on 04.05.2017.
 */

public class FiveDigitsSort1_1_2 {
    public static void main(String[] args) {

        Object a5[] = new Object[5];
        //

        System.out.println("Please enter 5 numbers with a space...");
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i < a5.length; i++){
            a5[i] = scanner.nextInt();
        }


        System.out.println("Initial array");
        for (Object number : a5) {
            System.out.print(number + ", ");
        }

        Arrays.sort(a5);

        System.out.println();
        System.out.println();
        System.out.println("Sorted array");
        for (Object number : a5) {
            System.out.print(number + ", ");
        }

    }
}


