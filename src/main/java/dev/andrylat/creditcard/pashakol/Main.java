package dev.andrylat.creditcard.pashakol;

public class Main {

    public static void main(String[] args) {

        String card = "3711565954848252";

        // ексепшен


        CardNumberPattern cardNumberPattern = new CardNumberPattern();
        cardNumberPattern.isValid(card);

        CardTypeQualifier cardTypeQualifier = new CardTypeQualifier();
        cardTypeQualifier.cardTypeQualifier(card);


    }
}
