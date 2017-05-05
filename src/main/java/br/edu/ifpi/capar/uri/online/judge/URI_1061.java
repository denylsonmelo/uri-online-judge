package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1061 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int diaInicio, diaFim, horaInicio, horaFim, minutoInicio, minutoFim, segundoInicio, segundoFim, duracaoDias, duracaoHoras, duracaoMinutos, duracaoSegundos;

        String[] tempos = br.readLine().split("Dia ");
        diaInicio = Integer.parseInt(tempos[1]);

        tempos = br.readLine().split(" : ");
        horaInicio = Integer.parseInt(tempos[0]);
        minutoInicio = Integer.parseInt(tempos[1]);
        segundoInicio = Integer.parseInt(tempos[2]);

        tempos = br.readLine().split("Dia ");
        diaFim = Integer.parseInt(tempos[1]);

        tempos = br.readLine().split(" : ");
        horaFim = Integer.parseInt(tempos[0]);
        minutoFim = Integer.parseInt(tempos[1]);
        segundoFim = Integer.parseInt(tempos[2]);

        duracaoDias = diaFim - diaInicio;

        if (horaFim < horaInicio) {
            duracaoDias--;
            duracaoHoras = 24 - horaInicio + horaFim;
        } else {
            duracaoHoras = horaFim - horaInicio;
        }
        
        if (minutoFim < minutoInicio) {
            duracaoHoras--;
            duracaoMinutos = 60 - minutoInicio + minutoFim;
        } else {
            duracaoMinutos = minutoFim - minutoInicio;
        }
        
        if (segundoFim < segundoInicio) {
            duracaoMinutos--;
            duracaoSegundos = 60 - segundoInicio + segundoFim;
        } else {
            duracaoSegundos = segundoFim - segundoInicio;
        }

        System.out.println(duracaoDias + " dia(s)\n"
                + duracaoHoras + " hora(s)\n"
                + duracaoMinutos + " minuto(s)\n"
                + duracaoSegundos + " segundo(s)");
    }
}
