package exercicios_estrutura_repetitivas;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            } else if (tipo == 2)  {
                gasolina += 1;
            } else if (tipo == 3) {
                diesel += 1;
            } else {
                System.out.println("Informe um codigo valido");
            }

           tipo = sc.nextInt();
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %s%n Gasolina: %s%n Diesel: %s%n", alcool, gasolina, diesel);
        // System.out.printf("Gasolina: %s%n", gasolina);
        // System.out.printf("Diesel: %s%n", diesel);

       sc.close(); 
    }
}
