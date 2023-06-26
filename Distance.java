package day6assignment.FunctionalPrograms;

import java.util.Scanner;

public class Distance {
    static void calculate(int x, int y) {
        System.out.println("distance is " + Math.pow((x * x + y * y), 0.5));
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter value for x");
            int x = scanner.nextInt();
            System.out.println("enter value for y ");
            int y = scanner.nextInt();
            calculate(x, y);
            scanner.close();
        } catch (Exception e) {
            System.out.println("enter integer only");
        }
    }
}