package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1072 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int qtdNumerosALer, numeroLido, dentroDoIntervalo = 0;
        qtdNumerosALer = Integer.parseInt(br.readLine());

        for (int i = 1; i <= qtdNumerosALer; i++) {
            numeroLido = Integer.parseInt(br.readLine());
            if(numeroLido >= 10 && numeroLido <= 20)
                dentroDoIntervalo++;
        }
        
        System.out.println(dentroDoIntervalo + " in\n"
                + (qtdNumerosALer - dentroDoIntervalo) + " out");
    }
}
