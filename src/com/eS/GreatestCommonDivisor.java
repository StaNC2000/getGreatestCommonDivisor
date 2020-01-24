package com.eS;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber){

        int commonDivider = 0;

        if (firstNumber < 10 || secondNumber < 10){
            return - 1;
        }

        while (firstNumber != secondNumber){
            if (firstNumber > secondNumber){
                firstNumber = firstNumber - secondNumber;
            }
            else {
                secondNumber = secondNumber - firstNumber;
            }
        }
        commonDivider = firstNumber;

        return commonDivider;
    }
    public static void main(String[] args) {
	// write your code here

        System.out.println(getGreatestCommonDivisor(12, 30));
    }
}
