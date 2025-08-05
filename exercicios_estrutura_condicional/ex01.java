package exercicios_estrutura_condicional;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        x = sc.nextInt();

        if (x >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
