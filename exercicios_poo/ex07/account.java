package exercicios_poo.ex07;

import java.util.Locale;
import java.util.Scanner;

public class account {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int account;
        double initialValue;
        String name;
        char character;



        System.out.printf("Enter account number: %n");
        account = sc.nextInt();
        sc.nextLine();

        System.out.printf("Enter account holder: %n");
        name = sc.nextLine();

        System.out.printf("Is there na initial deposit (y/n)? %n");




        System.out.printf("Enter initial deposit value: %n");
        initialValue = sc.nextDouble();

        System.out.printf("Account data: %n");
        System.out.println("Account " + account + "," + "Holder: " + name + "," + "Balance: " + "$ " + initialValue);

        System.out.printf("Enter a deposit value: %n");


        sc.close();
    }
}
