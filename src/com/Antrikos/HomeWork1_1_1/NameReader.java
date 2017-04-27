/**
 * Created by Avtpikoc on 20.04.2017.
 * GoJava Module 1.1_1
 */
package com.Antrikos.HomeWork1_1_1;

import java.util.Scanner;

public class NameReader {

    public static void main(String[] args){

        System.out.println("First Name =...");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Ku, "+name +"! Glad to see you!");
    }
}
