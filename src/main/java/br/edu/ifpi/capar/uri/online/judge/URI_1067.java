package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1067 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valorLido = Integer.parseInt(br.readLine());

        for (int numero = 0; numero <= valorLido; numero++) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }
    }
}
