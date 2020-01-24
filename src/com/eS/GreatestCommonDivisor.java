package com.eS;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {

        int commonDivider = 1;

        if (firstNumber < 10 || secondNumber < 10){
            return - 1;
        }
//
//        while (firstNumber != secondNumber){
//            if (firstNumber > secondNumber){
//                firstNumber = firstNumber - secondNumber;
//            }
//            else {
//                secondNumber = secondNumber - firstNumber;
//            }
//        }
//        commonDivider = firstNumber;
//
//        return commonDivider;

        for (int i = 1; i < firstNumber && i <= secondNumber; i++) {
            System.out.println(i + " " + firstNumber + " " + secondNumber);
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                System.out.println("First " + firstNumber + " Second " + secondNumber + " Divider " + i);
                commonDivider = i;
            }

            else {

                System.out.println("First " + firstNumber + " Second " + secondNumber + " No divide by " + i);            }


        }

        return commonDivider;

    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(getGreatestCommonDivisor(12, 30));
    }
}
