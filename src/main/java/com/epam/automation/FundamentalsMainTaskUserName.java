package com.epam.automation;

import java.util.Scanner;

public class FundamentalsMainTaskUserName {
    public static void main(String[] args) {
        String name = "";
        System.out.println("Please, enter your name:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()){
            name = scanner.next();
        }
        System.out.printf("Hello, %s! Glad to see you!", name);
    }
}
