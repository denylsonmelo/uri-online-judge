package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1070 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valorLido = Integer.parseInt(br.readLine());

        if (valorLido % 2 == 0) {
            valorLido++;
        }
        for (int i = 1; i <= 6; i++) {
            System.out.println(valorLido);
            valorLido += 2;
        }
    }
}
