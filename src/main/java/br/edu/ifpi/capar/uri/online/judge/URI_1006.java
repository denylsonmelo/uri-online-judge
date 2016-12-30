package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1006 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double valor1, valor2, valor3;
        valor1 = Double.parseDouble(br.readLine());
        valor2 = Double.parseDouble(br.readLine());
        valor3 = Double.parseDouble(br.readLine());

        System.out.println(String.format("MEDIA = %.1f", (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10));
    }
}
