package dev.andrylat.creditcard.pashakol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTypeQualifierTest {

    @Test
    void cardTypeQualifier() {

        CardTypeQualifier test1 = new CardTypeQualifier();
        test1.cardTypeQualifier("4153456495956565");
        test1.cardTypeQualifier("5153456495956565");
        test1.cardTypeQualifier("5253456495956565");
        test1.cardTypeQualifier("5353456495956565");
        test1.cardTypeQualifier("5453456495956565");
        test1.cardTypeQualifier("5553456495956565");
        test1.cardTypeQualifier("5053456495956565");
        test1.cardTypeQualifier("6011456495956565");
        test1.cardTypeQualifier("3753456495956565");
        test1.cardTypeQualifier("5053456495956565");
        test1.cardTypeQualifier("5053456495956565");
        test1.cardTypeQualifier("65456495956565");
        test1.cardTypeQualifier("555353456495956565");
        test1.cardTypeQualifier("asdasd");
        test1.cardTypeQualifier("asdas321d");
        test1.cardTypeQualifier("");
        test1.cardTypeQualifier("0");
        test1.cardTypeQualifier("03122");
        test1.cardTypeQualifier("0123213");
        test1.cardTypeQualifier("50534564959565651");
        test1.cardTypeQualifier(null);




    }


}