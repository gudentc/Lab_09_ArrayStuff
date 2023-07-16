import java.util.Random;
import java.util.Scanner;

public class RandomIntArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        //Declare Variables
        double total = 0;
        double numCount = 0;
        double average = 0;

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

    }
}