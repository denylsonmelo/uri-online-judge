package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1017 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tempoGasto, velocidadeMedia;

        tempoGasto = Integer.parseInt(br.readLine());
        velocidadeMedia = Integer.parseInt(br.readLine());

        System.out.println(String.format("%.3f", tempoGasto * velocidadeMedia / 12.0));
    }
}
