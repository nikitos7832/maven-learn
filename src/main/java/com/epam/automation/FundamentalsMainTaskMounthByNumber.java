package com.epam.automation;

import java.util.Scanner;

public class FundamentalsMainTaskMounthByNumber {
    public static void main(String[] args) {
        int mounthNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter mouth number:");
        if (scanner.hasNextInt()){
            mounthNumber = scanner.nextInt();
        }
        switch(mounthNumber){
            case 1:{
                System.out.println("It's a January");
                break;
            }
            case 2:{
                System.out.println("It's a February");
                break;
            }
            case 3:{
                System.out.println("It's a March");
                break;
            }
            case 4:{
                System.out.println("It's an April");
                break;
            }
            case 5:{
                System.out.println("It's a May");
                break;
            }
            case 6:{
                System.out.println("It's a June");
                break;
            }
            case 7:{
                System.out.println("It's a July");
                break;
            }
            case 8:{
                System.out.println("It's a August");
                break;
            }
            case 9:{
                System.out.println("It's a September");
                break;
            }
            case 10:{
                System.out.println("It's an October");
                break;
            }
            case 11:{
                System.out.println("It's a November");
                break;
            }
            case 12:{
                System.out.println("It's a December");
                break;
            }
            default:System.out.println("It's not a number of mounth");
        }
    }}
