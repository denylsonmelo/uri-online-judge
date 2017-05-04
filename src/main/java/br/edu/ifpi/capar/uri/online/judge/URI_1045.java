package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1045 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double valorA, valorB, valorC;

        String[] valores = br.readLine().split(" ");
        valorA = Double.parseDouble(valores[0]);
        valorB = Double.parseDouble(valores[1]);
        valorC = Double.parseDouble(valores[2]);

        double maior;
        if ((valorA < valorB) && (valorB > valorC)) {
            maior = valorA;
            valorA = valorB;
            valorB = maior;
        } else if (valorB < valorC && valorC > valorA) {
            maior = valorA;
            valorA = valorC;
            valorC = maior;
        }

        if (valorA >= (valorB + valorC)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            valorA = Math.pow(valorA, 2);
            valorB = Math.pow(valorB, 2);
            valorC = Math.pow(valorC, 2);

            if (valorA == (valorB + valorC)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (valorA > (valorB + valorC)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (valorA < (valorB + valorC)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (valorA == valorB && valorA == valorC) {
                System.out.println("TRIANGULO EQUILATERO");
            }else if (valorA == valorB || valorA == valorC || valorB == valorC) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
