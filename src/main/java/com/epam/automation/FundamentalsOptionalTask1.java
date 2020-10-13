package com.epam.automation;

import java.util.Arrays;
import java.util.Scanner;

public class FundamentalsOptionalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringLengthComparator stringLengthComparator = new StringLengthComparator();
        int n=0;
        double averageLength = 0;
        System.out.println("Enter n:");
        if (scanner.hasNextInt()){
            n=scanner.nextInt();
        }
        String [] numbersArray = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter %d number:",i);

            if (scanner.hasNextInt()){
                numbersArray[i] = scanner.next();
                averageLength += numbersArray[i].length();
            }
        }
        averageLength /= n;
        Arrays.sort(numbersArray, stringLengthComparator);
        System.out.printf("Number with minimal length:%s, length=%d.\nNumber with maximum length:%s, length=%d.\n",
                numbersArray[0],numbersArray[0].length(),
                numbersArray[n-1],numbersArray[n-1].length());
        System.out.println("Numbers sorted by length:");
        for (String number:
             numbersArray) {
            System.out.println(number);
        }
        System.out.printf("Average length of numbers:%f\n",averageLength);
        System.out.println("Numbers with length less than average length:");
        for (String number:
             numbersArray) {
            if (number.length()<averageLength){
                System.out.printf("Number:%s, length:%d\n",number,number.length());
            }
        }
    }
}
