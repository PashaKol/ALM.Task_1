package dev.andrylat.creditcard.pashakol;

public class Mortgage_Calculator {

    private double price;// сумма кредита
    private double downPayment; // аванс
    private double apr; // процент по кредитуC
    private double month; // мемяц

    public Mortgage_Calculator(double price, double downPayment, double apr , double month) {
        this.price = price;
        this.downPayment = downPayment;
        this.apr = apr;
        this.month = month;
    }



    public double calculator(){

        double result = (price- downPayment)/month + price * (apr/ 100/12.00);
       return result;
    }


    @Override
    public String toString() {
        return "Your date :{" +
                "price=" + price +
                ", downPayment=" + downPayment +
                ", apr=" + apr +
                ", month=" + month +
                '}' + "Your monthly payment "+ calculator();
    }
}
