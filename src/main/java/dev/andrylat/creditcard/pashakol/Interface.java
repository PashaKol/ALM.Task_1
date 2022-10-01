package dev.andrylat.creditcard.pashakol;

import java.util.Scanner;

public class Interface {
    private double price;
    private double downPayment;
    private double apr;
    private double month;

    private  int checkCard = 1;
    private  int calculator = 2;
    private  String cardNumber = "";
    Scanner scanner = new Scanner(System.in);

    Scanner scanner2 = new Scanner(System.in);




    public void start(){

        System.out.println("Hello client. \n" +
                "If you want to check your card press 1 \n" +
                "If you want to show the monthly payment for standard fixed-rate loan  press 2 ");

        int choice = scanner.nextInt();

        if(choice == checkCard){
            System.out.println("You have selected 1. Please enter your card number");
            System.out.println("Example : 4514456915655484");

            cardNumber = scanner2.nextLine();
            CardTypeQualifier cardTypeQualifier = new CardTypeQualifier();
            cardTypeQualifier.cardTypeQualifier(cardNumber);
        } else if (choice == calculator) {
            System.out.println("You have selected 2. Please enter the following information");

            System.out.println("Please enter the credit amount ");
              price = scanner.nextDouble();
            if(price <=0){
                System.err.println("Price can't be 0 or less 0");

            }else {
                System.out.println("Please enter your downPayment or 0 ");
                downPayment = scanner.nextDouble();
                if (downPayment >= price) {
                    System.err.println("DownPayment  can't  be more than price");
                } else {
                    System.out.println("Please enter your interest rate ");
                    apr = scanner.nextDouble();
                    if (apr <= 0 || apr >= 100) {
                        System.err.println("Interest rate can't be 0 or less 100 or more 100");

                    } else {
                        System.out.println("Please enter number of months");
                        month = scanner.nextDouble();
                        if (month <= 0) {
                            System.err.println("Months rate can't be 0 or less");

                        } else {

                            Mortgage_Calculator calculator1 = new Mortgage_Calculator(price, downPayment, apr, month);
                            calculator1.calculator();
                            System.out.println(calculator1);

                        }
                    }
                }
            } }else {
            System.out.println("Make your choice 1 or 2");
            System.out.println("____________________");
            start();
        }

    }

}
