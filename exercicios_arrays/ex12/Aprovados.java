package exercicios_arrays.ex12;

import java.util.Locale;
import java.util.Scanner;

class Alunos {
    private String nome;
    private double nota1, nota2;

    public Alunos(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double media() {
        return (nota1 + nota2) / 2.0;
    }

    public boolean aprovado() {
        return media() >= 6.0;
    }
}

public class Aprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos alunos serao digitados? ");

        int n = sc.nextInt();
        sc.nextLine();

        Alunos[] alunos = new Alunos[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite seu nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            sc.nextLine();

            alunos[i] = new Alunos(nome, nota1, nota2);
        }

        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < n; i++) {
            if (alunos[i].aprovado()) {
                System.out.println(alunos[i].getNome());
            }
        }

        /* Poderia utilizar forEach tbm, ficaria assim:
            for (Alunos a : alunos) {
                if (a.aprovado()) {
                    System.out.println(a.getNome());
              }
            }
*/
        sc.close();

    }
}
