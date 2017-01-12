package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1020 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int anos, meses, dias;
        int idadeEmDias = Integer.parseInt(br.readLine());

        anos = idadeEmDias / 365;
        meses = idadeEmDias % 365 / 30;
        dias = idadeEmDias % 365 % 30;

        System.out.println(anos + " ano(s)\n"
                + meses + " mes(es)\n"
                + dias + " dia(s)");
    }
}
