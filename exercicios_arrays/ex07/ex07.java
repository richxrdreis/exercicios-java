package exercicios_arrays.ex07;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double maiorNumero;
        int n, posmaior;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        maiorNumero = vetor[0];
        posmaior = 0;

        for (int i = 0; i<n; i++) {
            if (vetor[i] > maiorNumero) {
                maiorNumero = vetor[i];
                posmaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", maiorNumero);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posmaior);

        sc.close();
    }
}
