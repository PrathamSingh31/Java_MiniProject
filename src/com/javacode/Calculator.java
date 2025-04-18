package com.javacode;
import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {

        static ArrayList<Double> results= new ArrayList<Double>();

        public static double Add(double a, double b){
            return a + b;
        }
    public static double Sub(double a, double b){
        return a - b;
    }
    public static double Multiply(double a, double b){
        return a * b;
    }
    public static double Divide(double a, double b){
            if (b!=0){
                return a/b;
        }else{
            System.out.println("cnnot divide by zero");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. View Results History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.println("enter the number:");
                double num1 = in.nextDouble();
                System.out.println("enter the number:");
                double num2 = in.nextDouble();
                double result = 0;

                switch (choice) {
                    case 1:
                        result = Add(num1, num2);
                        break;
                    case 2:
                        result = Sub(num1, num2);
                        break;
                    case 3:
                        result = Multiply(num1, num2);
                        break;
                    case 4:
                        result = Divide(num1, num2);
                        break;
                }
                System.out.println("Result" + " " +result);
                results.add(result);

            } else if (choice == 5) {
                System.out.println("Result History: " + results);
            } else if (choice == 6) {
                System.out.println("Exiting... Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        }
        in.close();
    }



        }






