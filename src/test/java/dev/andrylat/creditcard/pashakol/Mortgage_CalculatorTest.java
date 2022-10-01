package dev.andrylat.creditcard.pashakol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mortgage_CalculatorTest {

    @Test
    void calculator() {
        Mortgage_Calculator test = new Mortgage_Calculator(0,0,0,0);
        Mortgage_Calculator test2 = new Mortgage_Calculator(100000,1515,12,0);
        Mortgage_Calculator test3 = new Mortgage_Calculator(62626,23,0,16);
        Mortgage_Calculator test4 = new Mortgage_Calculator(12161,0,12,56);
        Mortgage_Calculator test5 = new Mortgage_Calculator(151515,1516161616,10,10);
        Mortgage_Calculator test6 = new Mortgage_Calculator(40,-101,10,10);
        Mortgage_Calculator test7 = new Mortgage_Calculator(-100,-10,-40,0);
    }
}