package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1005 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double valor1, valor2;
        valor1 = Double.parseDouble(br.readLine());
        valor2 = Double.parseDouble(br.readLine());

        System.out.println(String.format("MEDIA = %.5f", (valor1 * 3.5 + valor2 * 7.5) / 11));
    }
}
