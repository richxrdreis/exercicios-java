package exercicios_estrutura_repetitivas;

import java.util.Scanner;

public class for8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
                System.out.println(i);
        }

        sc.close();
    }
}
