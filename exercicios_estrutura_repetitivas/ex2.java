package exercicios_estrutura_repetitivas;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto quadrante");
            } else {
                System.out.println("");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
