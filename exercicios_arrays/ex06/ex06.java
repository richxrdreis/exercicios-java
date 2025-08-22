package exercicios_arrays.ex06;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, qtdpares;

        System.out.println("Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        int[] vetor = new int[n];


        for(int i=0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES: ");

        qtdpares = 0;

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d ", vetor[i]);
                qtdpares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

        sc.close();
    }
}
