package com.epam.automation;

public class FundamentalsMainTaskReverseCommandLineArguments {
    public static void main(String[] args) {
        if (args.length!=0){
            for (int i = args.length-1; i >= 0 ; i--) {
                System.out.printf("%s ", args[i]);
            }
        }else{
            System.out.println("CommandLine haven't arguments");
        }
    }
}
