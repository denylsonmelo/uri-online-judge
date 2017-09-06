package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1198 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long qtdExercitoHashmat, qtdExercitoOponente;
        String linhaLida;
        String[] valores;

        while ((linhaLida = br.readLine()) != null) {
            valores = linhaLida.split(" ");
            qtdExercitoHashmat = Long.parseLong(valores[0]);
            qtdExercitoOponente = Long.parseLong(valores[1]);
            System.out.println(Math.max(qtdExercitoHashmat, qtdExercitoOponente) - Math.min(qtdExercitoHashmat, qtdExercitoOponente));
        }
    }
}
