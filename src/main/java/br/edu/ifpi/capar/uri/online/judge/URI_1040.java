package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1040 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numeros = br.readLine().split(" ");
        double nota1 = Double.parseDouble(numeros[0]);
        double nota2 = Double.parseDouble(numeros[1]);
        double nota3 = Double.parseDouble(numeros[2]);
        double nota4 = Double.parseDouble(numeros[3]);
        double media = (nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4 * 1) / 10;

        System.out.println(String.format("Media: %.1f", media));
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 || media <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaExame = Double.parseDouble(br.readLine());
            System.out.println(String.format("Nota do exame: %.1f", notaExame));
            media = (media + notaExame) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println(String.format("Media final: %.1f", media));
        }
    }
}
