package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numPeca1, numPeca2;
        double valorPeca1, valorPeca2, ValorTotal;

        numPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        numPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        ValorTotal = numPeca1 * valorPeca1 + numPeca2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", ValorTotal);

        sc.close();
    }
}
