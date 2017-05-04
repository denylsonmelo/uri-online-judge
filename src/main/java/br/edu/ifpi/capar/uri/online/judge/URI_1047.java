package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int horaInicio, horaFim, minutoInicio, minutoFim, duracaoHoras, duracaoMinutos;

        String[] tempos = br.readLine().split(" ");
        horaInicio = Integer.parseInt(tempos[0]);
        minutoInicio = Integer.parseInt(tempos[1]);
        horaFim = Integer.parseInt(tempos[2]);
        minutoFim = Integer.parseInt(tempos[3]);

        if (horaInicio == horaFim && minutoInicio == minutoFim) {
            duracaoHoras = 24;
            duracaoMinutos = 0;
        } else {
            if (horaFim < horaInicio) {
                duracaoHoras = 24 - horaInicio + horaFim;
            } else {
                duracaoHoras = horaFim - horaInicio;
            }
            if(minutoFim < minutoInicio){
                duracaoMinutos = 60 - minutoInicio + minutoFim;
                duracaoHoras -= 1;
            }else{
                duracaoMinutos = minutoFim - minutoInicio;
            }
        }

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
    }
}
