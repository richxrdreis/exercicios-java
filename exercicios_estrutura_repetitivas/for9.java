package exercicios_estrutura_repetitivas;

import java.util.Scanner;

public class for9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;
        for(int i = 0; i <= n; i++) {
            soma = soma + i;
        }

        System.out.println(soma);

        sc.close();
    }
}
