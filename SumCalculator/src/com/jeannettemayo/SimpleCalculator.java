package com.jeannettemayo;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        //
        return this.firstNumber;
    }

    public double getSecondNumber() {
        //
        return this.secondNumber;
    }
    public void setFirstNumber( double f_Number) {
        /* 'this' sets the value passed through 'f_number' to the variable: 'firstNumber'
        in this class */
        this.firstNumber = f_Number;
    }
    public void setSecondNumber(double s_Number) {
        this.secondNumber = s_Number;
    }
    public double getAdditionResult() {
        double sum = firstNumber + secondNumber;
        return sum;
    }
    public double getSubtractionResult() {
        double sub = firstNumber - secondNumber;
        return sub;
    }
    public double getMultiplicationResult() {
        double mult = firstNumber * secondNumber;
        return mult;
    }

    public double getDivisionResult() {
        double div = firstNumber / secondNumber;
        if(secondNumber == 0) {
            return 0;
        }
        return div;
    }
}
