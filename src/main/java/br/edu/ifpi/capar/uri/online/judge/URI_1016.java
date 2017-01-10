package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1016 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int distancia, tempoPorKmY = 2;
        
        distancia = Integer.parseInt(br.readLine());

        System.out.println(distancia * tempoPorKmY + " minutos");
    }
}
