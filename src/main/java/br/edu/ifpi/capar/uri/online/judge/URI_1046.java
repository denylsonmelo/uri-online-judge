package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1046 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inicio, fim, duracao;

        String[] tempos = br.readLine().split(" ");
        inicio = Integer.parseInt(tempos[0]);
        fim = Integer.parseInt(tempos[1]);


        if (fim < inicio) {
            duracao = 24 - inicio + fim;
        } else if (inicio == fim) {
            duracao = 24;
        } else {
            duracao = fim - inicio;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
