package exercicios_arrays.ex05;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

    public static class Pessoa {
        private String nome;
        private int idade;
        private double altura;

        public Pessoa(String nome, int idade, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public double getAltura() {
            return altura;
        }

    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int pessoas = sc.nextInt();
        sc.nextLine();

        Pessoa[] vetor = new Pessoa[pessoas];

        double somaAltura = 0.0;
        int menores16 = 0;

        for (int i = 0; i < pessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            vetor[i] = new Pessoa(nome, idade, altura);

            somaAltura += altura;
            if (idade < 16) {
                menores16++;
            }
        }

        double mediaAlturas = somaAltura / pessoas;
        double percentualMenores = ((double) menores16 / pessoas) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (Pessoa p : vetor) {
            if (p.getIdade() < 16) {
                System.out.println(p.getNome());
            }
        }


        sc.close();
    }
}
