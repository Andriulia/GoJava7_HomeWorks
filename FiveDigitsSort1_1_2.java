package com.Draft;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Avtpikoc on 12.05.2017.
 */
public class FiveDigitsSort1_1_2 {
    public static void main(String[] args) {

        System.out.println("Please enter 5 numbers with a space...");

        for (;;) {
            Exc();
            continue;
        }

    }

    public static void Exc() {

        Scanner scanner = new Scanner(System.in);

        try {

            int a5[] = new int[5];

            for(int i=0;i < a5.length; i++) {   // 1
                a5[i] = scanner.nextInt();      // 1
            }                                   // 1

            System.out.println("Initial array:");
            for (Object number : a5) {
                System.out.print(number + ", ");
                break;
            }

            System.out.println("Initial array:");
            for (Object number : a5) {
                System.out.print(number + ", ");
            }

            for (int i = 0; i < a5.length; i++) {
                int min = a5[i];
                int imin = i;
                for (int j = i + 1; j < a5.length; j++) {
                    if (a5[j] < min) {
                        min = a5[j];
                        imin = j;
                    }
                }
                if (i != imin) {
                    int temp = a5[i];
                    a5[i] = a5[imin];
                    a5[imin] = temp;
                }
            }


            System.out.println();
            System.out.println();
            System.out.println("Sorted array");
            for (Object number : a5) {
                System.out.print(number + ", ");
            }

        } catch (InputMismatchException e) {

            System.out.println("Another input...");

        }

    }

}
