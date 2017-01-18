package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1042 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numeros = br.readLine().split(" ");
        int numero1 = Integer.parseInt(numeros[0]);
        int numero2 = Integer.parseInt(numeros[1]);
        int numero3 = Integer.parseInt(numeros[2]);

        if (numero1 < numero2) {
            if (numero1 < numero3) {
                System.out.println(numero1);
                if (numero3 < numero2) {
                    System.out.println(numero3);
                    System.out.println(numero2);
                } else {
                    System.out.println(numero2);
                    System.out.println(numero3);
                }
            } else {
                System.out.println(numero3);
                System.out.println(numero1);
                System.out.println(numero2);
            }
        } else if (numero2 < numero3) {
            System.out.println(numero2);
            if (numero1 < numero3) {
                System.out.println(numero1);
                System.out.println(numero3);
            } else {
                System.out.println(numero3);
                System.out.println(numero1);
            }
        } else {
            System.out.println(numero3);
            System.out.println(numero2);
            System.out.println(numero1);
        }
        System.out.println();
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
    }
}
