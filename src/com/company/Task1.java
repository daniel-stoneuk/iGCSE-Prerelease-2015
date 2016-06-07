package com.company;

import java.io.BufferedInputStream;
import java.util.Scanner;

import static java.lang.System.in;

public class Task1 {

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the baby's temperature: \n");
            double temperature;
            try {
                temperature = in.nextDouble();
            } catch (Exception e) {
                System.out.print("Please enter a number\n");
                continue;
            }
            String returnMessage = "";
            if (temperature > 37.5) returnMessage = "Baby temperature is too high!";
            else if (temperature < 36.0) returnMessage = "Baby temperature is too low!";
            else returnMessage = "Baby temperature is okay.";
            System.out.println(returnMessage);
        }
    }
}
