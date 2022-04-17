package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(addNumbers(getNumber("a1 = "), getNumber("a2 = "),
                getNumber("a3 = "), getNumber("a4 = ")));
    }

    public static double addNumbers(String a, String b){
        double a1 = Double.parseDouble(a);
        double b1 = Double.parseDouble(b);
        return a1 + b1;
    }

    public static double addNumbers(String... values){
        double sum = 0;
        for (String str : values) {
            double n = Double.parseDouble(str);
            sum += n;
        }
        return sum;
    }

    public static String getNumber(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
