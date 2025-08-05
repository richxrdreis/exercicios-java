package exercicios_estrutura_repetitivas;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int senhaCorreta = sc.nextInt();

        while (senhaCorreta != 2002) {
            System.out.println("Senha invalida");
            senhaCorreta = sc.nextInt();
        }

        System.out.println("Acesso Permitido");
        
        sc.close();
    }
}
