package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1065 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double valorLido;
        int qtdPar = 0;

        for (int valores = 1; valores <= 5; valores++) {
            valorLido = Double.parseDouble(br.readLine());
            if (valorLido % 2 == 0) {
                qtdPar++;
            }
        }

        System.out.println(qtdPar + " valores pares");
    }
}
