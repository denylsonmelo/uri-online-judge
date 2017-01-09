package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1014 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int distancia = Integer.parseInt(br.readLine());
        double totalCombustivel = Double.parseDouble(br.readLine());

        System.out.println(String.format("%.3f km/l", distancia / totalCombustivel));
    }
}
