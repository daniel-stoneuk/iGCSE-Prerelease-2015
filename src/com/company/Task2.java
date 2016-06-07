package com.company;


import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int count = (3 * 60) / 10;
        double[] babyRecordings = new double[count];
        int countOutside = 0;
        for (int i = 0; i < count; i++) {
            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter the baby's temperature after " + (i+1) * 10 + " minutes: \n");
                double temperature = 0;
                try {
                    temperature = in.nextDouble();
                } catch (Exception e) {
                    System.out.print("Please enter a number...\n\n");
                    continue;
                }
                babyRecordings[i] = temperature;
                break;
            }
        }

        double lowestRecording = babyRecordings[0];
        double highestRecording = babyRecordings[0];
        for (double currentTemperature :
                babyRecordings) {
            if (currentTemperature < lowestRecording) lowestRecording = currentTemperature;
            if (currentTemperature > highestRecording) highestRecording = currentTemperature;
            if (currentTemperature > 37.5 || currentTemperature < 36.0) countOutside++;
        }

        double difference = highestRecording - lowestRecording;

        String errorMessage = "\nWARNING!!!!!";
        if (difference > 1)
            errorMessage +="\n\nBaby's temperature difference was > 1 ("
                    + difference + "°C)! ";

        if (countOutside > 2)
            errorMessage +="\n\nBaby's temperature went outside suitable range " +
                    countOutside + " times!";


        if (difference > 1 || countOutside > 2) System.out.println(errorMessage);

    }

}
