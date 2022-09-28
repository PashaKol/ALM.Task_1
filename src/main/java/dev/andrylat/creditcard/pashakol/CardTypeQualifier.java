package dev.andrylat.creditcard.pashakol;

public class CardTypeQualifier {
    private  static  final String noType = "-> This type of card does not exist";

    public void cardTypeQualifier(String number) {


        long firstPart = (Long.parseLong(number) / 1000000000000l);
        String string = String.valueOf(firstPart);

        if (string.startsWith(String.valueOf(4))) {
            System.out.print("Payment System is " + TypeOfCard.VISA);
        } else if ((string.startsWith(String.valueOf(51)))
                || (string.startsWith(String.valueOf(52)))
                || (string.startsWith(String.valueOf(53)))
                || (string.startsWith(String.valueOf(54)))
                || (string.startsWith(String.valueOf(55)))) {
            System.out.print("Payment System is " + TypeOfCard.MASTERCARD);
        } else if ((string.startsWith(String.valueOf(6011)))
                || ((string.startsWith(String.valueOf(65))))) {
            System.out.print("Payment System is " + TypeOfCard.DISCOVER);
        } else if ((string.startsWith(String.valueOf(35)))) {
            System.out.print("Payment System is " + TypeOfCard.JCB);
        } else if (((string.startsWith(String.valueOf(34))))
            ||((string.startsWith(String.valueOf(37))))) {
            System.out.print("Payment System is " + TypeOfCard.AMERICAN_EXPRESS);
        }else {

            System.err.println(noType);


            // ексепшен
        }

    }
}



