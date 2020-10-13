package com.epam.automation;

public class FundamentalsMainTaskSumAndMultiply {
    public static void main(String[] args) {
        if (args.length!=0){
            int summ = 0, multiply = 1;
            for (int i = args.length-1; i >= 0 ; i--) {
                summ+=Integer.parseInt(args[i]);
                multiply*=Integer.parseInt(args[i]);
            }
            System.out.printf("summ=%d, multiply=%d", summ, multiply);
        }else{
            System.out.println("CommandLine haven't arguments");
        }
    }
}
