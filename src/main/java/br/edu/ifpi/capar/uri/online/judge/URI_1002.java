package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1002 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double raio;
        final double pi = 3.14159;
        raio = Double.parseDouble(br.readLine());

        System.out.println(String.format("A=%.4f", pi*raio*raio));
    }
}
