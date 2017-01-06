package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valor1, valor2;
        valor1 = Integer.parseInt(br.readLine());
        valor2 = Integer.parseInt(br.readLine());

        System.out.println("SOMA = " + (valor1 + valor2));
    }
}
