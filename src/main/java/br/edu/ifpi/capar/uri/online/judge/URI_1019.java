package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1019 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int horas, minutos, segundos;
        int tempoTotalSegundos = Integer.parseInt(br.readLine());

        horas = tempoTotalSegundos / 3600;
        minutos = tempoTotalSegundos % 3600 / 60;
        segundos = tempoTotalSegundos % 3600 % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
