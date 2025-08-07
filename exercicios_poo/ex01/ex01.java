package exercicios_poo.ex01;

import java.util.Locale;
import java.util.Scanner;

import exercicios_poo.ex01.entities_ex01.Triangle;

public class ex01 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Aqui teremos a resolucao utilizando POO
        // Here we will have a resolution using OOP

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.printf("Enter the measures of triangle X: %n");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.printf("Enter the measures of triangle Y: %n");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        /* Aqui teremos um exemplo SEM o uso do POO - Somente para vermos a diferença
           Here we will have an example WITHOUT POO - Just to see the difference
         
        double xA, xB, xC, yA, yB, yC;

        System.out.printf("Enter the measures of triangle X: %n");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.printf("Enter the measures of triangle Y: %n");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
            */

        sc.close();
    }
}