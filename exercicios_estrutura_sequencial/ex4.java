package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, numeroHorasTrabalhadas;
        double valorRecebidoPorHoras;

        numeroFuncionario = sc.nextInt();
        numeroHorasTrabalhadas = sc.nextInt();
        valorRecebidoPorHoras = sc.nextDouble();

        double resultado = numeroHorasTrabalhadas * valorRecebidoPorHoras;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", resultado);

        sc.close();
    }
}
