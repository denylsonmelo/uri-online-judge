package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1071 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valorA, valorB, soma = 0;

        valorA = Integer.parseInt(br.readLine());
        valorB = Integer.parseInt(br.readLine());

        if (valorA > valorB) {
            for (int i=valorA-1;i>valorB;i--) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        } else if (valorA < valorB) {
            for (int i = valorA+1; i < valorB; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }

        System.out.println(soma);
    }
}
