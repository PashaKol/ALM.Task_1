package dev.andrylat.creditcard.pashakol;
import org.apache.commons.lang3.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardTypeQualifier {
    private static final String NOT_EXIST = "-> This type of card does not exist";
    private static final String PAYMENT = "-> Payment System is ";
    private static final String NO_EMPTY = "-> The card number cannot be empty or  null) ";
    private static final String NO_LETTER = "-> The card number cannot be blank or contain letters or 0) ";
    private static final String CORRECT = "Сredit Cars is correct.  ";
    private final int lengthCard = 16;

    public void cardTypeQualifier(String number) {

        if (number == null || number.isEmpty())
            System.err.println(NO_EMPTY);
        else {


            Pattern pattern = Pattern.compile("([2-6]([0-9]{3} ?))(([0-9]{4} ?){3})");
            Matcher numberCardMatcher = pattern.matcher(number);

            if (number.chars().allMatch(Character::isLetter) || !StringUtils.isNumeric(number))
                System.err.println(NO_LETTER);
            else if (!numberCardMatcher.matches() && (number.length() == lengthCard)) {
                System.err.println("NO_LETTER");
            } else {


                long firstPart = (Long.parseLong(number) / 1000000000000l);

                String string = String.valueOf(firstPart);
                if (numberCardMatcher.matches() && number.length() == lengthCard && string.startsWith(String.valueOf(4))) {

                    System.out.print("Credit Cars is correct. ");
                    System.out.println(PAYMENT + TypeOfCard.VISA);
                } else if (numberCardMatcher.matches() && number.length() == lengthCard && (string.startsWith(String.valueOf(51)))
                        || (string.startsWith(String.valueOf(52)))
                        || (string.startsWith(String.valueOf(53)))
                        || (string.startsWith(String.valueOf(54)))
                        || (string.startsWith(String.valueOf(55)))) {
                    System.out.print(CORRECT);
                    System.out.println(PAYMENT + TypeOfCard.MASTERCARD);

                } else if (numberCardMatcher.matches() && number.length() == lengthCard && (string.startsWith(String.valueOf(6011)))
                        || (string.startsWith(String.valueOf(65)))) {
                    System.out.print(CORRECT);
                    System.out.println(PAYMENT + TypeOfCard.DISCOVER);

                } else if (numberCardMatcher.matches() && number.length() == lengthCard && (string.startsWith(String.valueOf(35)))) {
                    System.out.print(CORRECT);
                    System.out.println(PAYMENT + TypeOfCard.JCB);

                } else if (numberCardMatcher.matches() && number.length() == lengthCard && ((string.startsWith(String.valueOf(34))))
                        || ((string.startsWith(String.valueOf(37))))) {
                    System.out.print(CORRECT);
                    System.out.println(PAYMENT + TypeOfCard.AMERICAN_EXPRESS);

                } else if (number.length() > 16 || number.length() < 16) {
                    System.err.println("Error:");
                    System.err.println("-> Credit Cars is invalid");
                    System.err.println("-> Our Card length = " + number.length() + ".");
                    System.err.println("-> The length of the card must be 16 .");
                } else {
                    System.err.println(NOT_EXIST);
                }

            }

        }
    }

}