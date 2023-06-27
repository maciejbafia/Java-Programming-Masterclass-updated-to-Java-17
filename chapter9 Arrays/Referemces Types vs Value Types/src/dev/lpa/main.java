package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

       int[] ar1 = readIntegers();
        System.out.println(minimumValue(ar1));

    }
    private static int minimumValue(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    private static int[] readIntegers() {
        Scanner s = new Scanner(System.in);
        System.out.println("select numbers and seperate them with \",\" ");

        String[] numbers = s.nextLine().split(",");
        int[] intArray = new int[numbers.length];

        for(int i =0; i< numbers.length; i++){
            intArray[i] = Integer.parseInt(numbers[i].trim()); // ucinamy przypadkowe spacje
        }
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }
}
