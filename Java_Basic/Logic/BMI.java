package logic;

import java.util.Scanner;

public class BMI {

    private static double convertHeight(double height) {
        return height * 0.3048;
    }

    private static void bmiCheck(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Your body to weight ratio is good.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are in the obesity range.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in feet: ");
        double height = scanner.nextDouble();
        
        double height_meter = convertHeight(height);

        double bmi = weight / (height_meter * height_meter);

        System.out.printf("Your BMI is: %.2f ".formatted(bmi));

        bmiCheck(bmi);
    }
}
