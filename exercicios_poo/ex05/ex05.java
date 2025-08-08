package exercicios_poo.ex05;

import java.util.Locale;
import java.util.Scanner;

import exercicios_poo.ex05.alunos.Alunos;

public class ex05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Alunos alunos = new Alunos();

        System.out.print("Insira seu nome: ");
        alunos.name = sc.nextLine();
        System.out.println(alunos.name);
        
        System.out.println("Insira suas tres notas na sequencia: ");
        alunos.nota1 = sc.nextDouble();
        alunos.nota2 = sc.nextDouble();
        alunos.nota3 = sc.nextDouble();
        System.out.printf("FINAL GRADE = %.2f%n", alunos.totalNota());
        
        if (alunos.totalNota() >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", alunos.pontosFaltando());
        }

        sc.close();
    }
}
