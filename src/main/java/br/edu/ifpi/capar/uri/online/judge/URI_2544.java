package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_2544 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quantidadeNinjas;
        String linhaLida;

        while ((linhaLida = br.readLine()) != null) {
            quantidadeNinjas = Integer.parseInt(linhaLida);
            System.out.println((int)(Math.log(quantidadeNinjas) / Math.log(2)));
        }
    }
}
