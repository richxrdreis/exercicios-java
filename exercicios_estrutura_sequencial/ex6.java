package exercicios_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A, B, C, areaT, areaC, areaTra, areaQ, areaRet;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // letra a) - área do triangulo retangulo (b*h/2)
        areaT = (A * C) / 2;

        // letra b) circulo (pi*r²) * pi = 3.14159
        areaC = 3.14159 * Math.pow(C, 2);

        // letra c) trapezio (B+b)*h/2))
        areaTra = (A + B) * C / 2;

        // d) l²
        areaQ = Math.pow(B, 2);

        // e) B * H
        areaRet = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaT);
        System.out.printf("CIRCULO: %.3f%n", areaC);
        System.out.printf("TRAPEZIO: %.3f%n", areaTra);
        System.out.printf("QUADRADO: %.3f%n", areaQ);
        System.out.printf("RETANGULO: %.3f%n", areaRet);

        sc.close();
    }
}
