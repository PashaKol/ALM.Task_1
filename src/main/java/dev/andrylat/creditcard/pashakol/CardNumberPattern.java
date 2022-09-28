package dev.andrylat.creditcard.pashakol;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardNumberPattern {

   private final int lengthCard = 16;

    public void isValid(String cardNumber){


        Pattern pattern = Pattern.compile("([2-6]([0-9]{3} ?))(([0-9]{4} ?){3})");
        Matcher numberCardMatcher = pattern.matcher(cardNumber);

        if (numberCardMatcher.matches() && cardNumber.length() == lengthCard) {
            System.out.print("Credit Cars is correct. ");

        } else if (!numberCardMatcher.matches()) {
            System.err.println("Error:");
            System.err.println("-> Credit Cars is invalid");
            System.err.println("-> The number of the card must be  start with  2,3,4,5,6");

        } else  if(cardNumber.length() > lengthCard || cardNumber.length() < lengthCard  ){
            System.err.println("Error:");
            System.err.println("-> Credit Cars is invalid");
            System.err.println("-> Our Card length = " + cardNumber.length() + ".");
            System.err.println("-> The length of the card must be 16 .");
        }
    }

}


// ексепшен