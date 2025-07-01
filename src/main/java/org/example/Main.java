package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");

        System.out.print("Choose a shape (1-3): ");
        int option = sc.nextInt();

        switch (option) {
            case 1: // circle
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();

                double areaCircle = calculateCircleArea(radius);
                System.out.printf("Area of the circle: %.2f\n",areaCircle );
                break;

            case 2: // triangle
                System.out.print("Enter the base: ");
                int base = sc.nextInt();
                System.out.print("Enter the height: ");
                int height = sc.nextInt();

                double areaTriangle = calculateTriangleArea(base, height);
                System.out.printf("Area of the triangle: %.2f\n", areaTriangle);
                break;

            case 3: // rectangle
                System.out.print("Enter the length: ");
                int length = sc.nextInt();
                System.out.print("Enter the width: ");
                int width = sc.nextInt();

                double areaRectangle = calculateRectangleArea(length, width);
                System.out.printf("Area of the rectangle: %.2f\n", areaRectangle);
                break;

            default:
                System.out.println("Invalid option.");
        }

        sc.close();
    }


    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}