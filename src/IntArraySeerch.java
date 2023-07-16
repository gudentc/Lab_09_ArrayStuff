import SafeInput.SafeInput;

import java.util.Random;
import java.util.Scanner;

public class IntArraySeerch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        //Declare Variables
        //Declare Variables
        double total = 0;
        double numCount = 0;
        double average = 0;
        int numSearch = 0;
        int numHit = 0;
        int indexPosition = 0;
        int min = 0;
        int max = 0;

        System.out.println("\nRandom integer array");

        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }

        for (int i = 0; i < dataPoints.length; i++) {
            numCount = numCount + 1;
            total = total + dataPoints[i];
        }
        average = total / numCount;
        System.out.println();
        System.out.println("\n" + String.format("%.0f", + numCount) + "\t\t:Random Numbers");
        System.out.println(String.format("%.0f", + total) + "\t:Numbers Total");
        System.out.println(String.format("%.2f", + average) + "\t:Average");

        System.out.println("\nThe average of the randomly generated number is " + String.format("%.2f", + average));

        numSearch = SafeInput.getInt(in,"Enter an integer you wish to look for");
        for (int i = 0; i < dataPoints.length; i++) {
            if (numSearch == dataPoints[i]) {
                numHit = numHit + 1;
            }
        }
        if (numHit == 1) {
            System.out.println("The integer " + numSearch + "only in the Array " + numHit + " time.");
        } else {
            System.out.println("Then integer " + numSearch + "only in the Array " + numHit + " time.");
        }
        numSearch = SafeInput.getInt(in, "Enter an number to look for its index if known");
        for (int i = 0; i < dataPoints.length; i++) {
            if (numSearch == dataPoints[i]) {
                indexPosition = i + 1;
                break;
            }
        }
        if (indexPosition == 0) {
            System.out.println("The integer " + numSearch + "only in the Array " + indexPosition + " times.");
        } else {
            System.out.println("The integer " + numSearch + "was found at Array index Position " + indexPosition + ".");
        }
        min = dataPoints[0];
        max = dataPoints[0];
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("\nThe lowest number in Array " + min);
        System.out.println("The highest number in Array " + max);
        System.out.println("\nSC function average");
        System.out.println(String.format("%.0f", + numCount) + "\t\t:Random Numbers");
        System.out.println(String.format("%.0f", + total) + "\t:Numbers Total");
        System.out.println(String.format("%.2f", + getAverage(dataPoints)) + "\t:Average");

        System.out.println("\nAverage of dataPoints is: " + String.format("%.2f", + getAverage(dataPoints)));
    }
    public static double getAverage(int[] dataPoints) {
        double numCount = 0;
        double total = 0;
        double average = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            numCount = numCount + 1;
            total = total + dataPoints[i];
        }
        average = total / numCount;

        return average;
    }

}

