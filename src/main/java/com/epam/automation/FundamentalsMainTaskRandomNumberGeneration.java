package com.epam.automation;

import java.util.Random;
import java.util.Scanner;

public class FundamentalsMainTaskRandomNumberGeneration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        System.out.print("Enter count of required random numbers:");
        if (scanner.hasNextInt()){
            count = scanner.nextInt();
            Random random = new Random();
            System.out.println("Random numbers in a row:");
            for (int i = 0; i < count; i++) {
                System.out.printf("%d ", random.nextInt());
            }
            System.out.println("\nRandom numbers in column:");
            for (int i = 0; i < count; i++) {
                System.out.printf("%d\n", random.nextInt());
            }
        }
    }
}
