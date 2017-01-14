package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double numero = Double.parseDouble(br.readLine());

        if (numero < 0 || numero > 100) {
            System.out.println("Fora de intervalo");
        } else if (numero >= 0 && numero <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (numero > 50 && numero <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo (75,100]");
        }
    }
}
