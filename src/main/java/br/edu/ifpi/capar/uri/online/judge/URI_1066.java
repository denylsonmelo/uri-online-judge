package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1066 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double valorLido;
        int qtdPar, qtdImpar, qtdPositivo, qtdNegativo;
        qtdPar = qtdImpar = qtdPositivo = qtdNegativo = 0;

        for (int valores = 1; valores <= 5; valores++) {
            valorLido = Double.parseDouble(br.readLine());
            if (valorLido % 2 == 0) {
                qtdPar++;
            } else {
                qtdImpar++;
            }
            if (valorLido > 0) {
                qtdPositivo++;
            }
            if (valorLido < 0) {
                qtdNegativo++;
            }
        }

        System.out.println(qtdPar + " valor(es) par(es)\n"
                + qtdImpar + " valor(es) impar(es)\n"
                + qtdPositivo + " valor(es) positivo(s)\n"
                + qtdNegativo + " valor(es) negativo(s)");
    }
}
