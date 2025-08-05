package exercicios_estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class for4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resultado = (double) num1 / num2;
                System.out.printf("%.1f%n", resultado);
            }
        }

        sc.close();
    }
}
