package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1064 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double valorLido, media = 0;
        int qtdPositivos = 0;

        for (int valores = 1; valores <= 6; valores++) {
            valorLido = Double.parseDouble(br.readLine());
            if (valorLido > 0) {
                qtdPositivos++;
                media += valorLido;
            }
        }

        System.out.println(qtdPositivos + " valores positivos");
        System.out.printf("%.1f\n", media/qtdPositivos);
    }
}
