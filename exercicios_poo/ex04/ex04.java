package exercicios_poo.ex04;

import java.util.Locale;
import java.util.Scanner;

import exercicios_poo.ex04.employee.Employee;

public class ex04 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee empregado = new Employee();

        System.out.print("Name: ");
        empregado.name = sc.nextLine();

        System.out.print("Gross salary: ");
        empregado.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        empregado.tax = sc.nextDouble();

        System.out.println("Employee: " + empregado);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        empregado.IncreaseSalary(percentage);

        System.out.println("Updated data: " + empregado);

        sc.close();
    }
}
