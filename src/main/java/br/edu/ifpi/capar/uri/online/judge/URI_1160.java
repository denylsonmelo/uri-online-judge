package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1160 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numeroCasosTeste, populacaoA, populacaoB, quantidadeAnos;
        double crescimentoA, crescimentoB;
        String[] valores;

        numeroCasosTeste = Integer.parseInt(br.readLine());
        for (int i = 0; i < numeroCasosTeste; i++) {
            valores = br.readLine().split(" ");
            populacaoA = Integer.parseInt(valores[0]);
            populacaoB = Integer.parseInt(valores[1]);
            crescimentoA = Double.parseDouble(valores[2]);
            crescimentoB = Double.parseDouble(valores[3]);

            for (quantidadeAnos = 1; quantidadeAnos <= 100; quantidadeAnos++) {
                populacaoA *= (1 + crescimentoA / 100);
                populacaoB *= (1 + crescimentoB / 100);
                if (populacaoA > populacaoB) {
                    break;
                }
            }

            if (quantidadeAnos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(quantidadeAnos + " anos.");
            }

        }
    }
}
