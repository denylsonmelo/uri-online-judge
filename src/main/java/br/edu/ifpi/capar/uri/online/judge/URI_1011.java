package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1011 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final double pi = 3.14159;
        double raio = Double.parseDouble(br.readLine());

        System.out.println(String.format("VOLUME = %.3f", 4.0 / 3 * pi * Math.pow(raio, 3)));
    }
}
