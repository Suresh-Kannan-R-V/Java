package com.CLIS.BankingSystem.Calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== CALCULATOR MENU ===");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Scientific Calculator");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    CalculatorFunction Basics = new BasicCalculator();
                    BasicCalculator(Basics, in);
                    break;
                case 2:
                    ScifCalculator Scif = new ScifCalculator();
                    ScifCalculator(Scif, in);
                    break;
                default:
                    return;
            }
        }
    }

    public static void BasicCalculator(CalculatorFunction cal, Scanner in) {
        while (true) {
            System.out.println("\n--- BASIC OPERATIONS ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose operation: ");
            int op = in.nextInt();
            int num1 = 0, num2 = 0;
            if (op != 0) {
                System.out.print("\nEnter Num1 :");
                num1 = in.nextInt();
                System.out.print("Enter Num2 :");
                num2 = in.nextInt();
                System.out.println();
            }

            switch (op) {
                case 1 -> System.out.println("Result: " + cal.add(num1, num2));
                case 2 -> System.out.println("Result: " + cal.sub(num1, num2));
                case 3 -> System.out.println("Result: " + cal.multi(num1, num2));
                case 4 -> {
                    try {
                        System.out.println("Result: " + cal.div(num1, num2));
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 5 -> System.out.println("Result: " + cal.pow(num1, num2));
                case 0 -> {
                    return;
                }
                default -> System.out.println("Invalid Input...");
            }
        }
    }

    public static void ScifCalculator(ScifCalculator cal, Scanner in) {
        while (true) {
            System.out.println("\n--- SCIFI OPERATIONS ---");
            System.out.println("1. Add         |   2. Subtract");
            System.out.println("3. Multiply    |   4. Divide");
            System.out.println("5. Power       |   6. Sine");
            System.out.println("7. Cosine      |   8. Tan");
            System.out.println("9. Square Root |  10. Cube Root");
            System.out.println("11. log        |  12. log10");
            System.out.println("13. exp        |  14. factorial!");
            System.out.println("0. Back to Main Menu\n");
            System.out.print("Choose operation: ");
            int op = in.nextInt();
            int num1 = 0, num2 = 0;
            if (op != 0) {
                System.out.print("\nEnter Num1 :");
                num1 = in.nextInt();
                if (op >= 1 && op <= 5) {
                    System.out.print("Enter Num2 :");
                    num2 = in.nextInt();
                }
                System.out.println();
            }

            switch (op) {
                case 1 -> System.out.println("Result: " + cal.add(num1, num2));
                case 2 -> System.out.println("Result: " + cal.sub(num1, num2));
                case 3 -> System.out.println("Result: " + cal.multi(num1, num2));
                case 4 -> {
                    try {
                        System.out.println("Result: " + cal.div(num1, num2));
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 5 -> System.out.println("Result: " + cal.pow(num1, num2));
                case 6 -> System.out.println("Result: " + cal.sin((double) num1));
                case 7 -> System.out.println("Result: " + cal.cos((double) num1));
                case 8 -> System.out.println("Result: " + cal.cos((double) num1));
                case 9 -> {
                    try {
                        System.out.println("sqrt(" + num1 + ") = " + cal.sqrt((double) num1));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 10 -> {
                    try {
                        System.out.println("cbrt(" + num1 + ") = " + cal.cbrt((double) num1));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 11 -> System.out.println("Result: " + cal.log((double) num1));
                case 12 -> System.out.println("Result: " + cal.log10((double) num1));
                case 13 -> System.out.println("Result: " + cal.exp((double) num1));
                case 14 -> System.out.println("Result: " + cal.factorial(num1) + "!");
                case 0 -> {
                    return;
                }
                default -> System.out.println("Invalid Input...");
            }
        }
    }
}
