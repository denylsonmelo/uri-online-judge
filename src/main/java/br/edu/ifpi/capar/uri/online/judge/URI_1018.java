package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int notas100, notas50, notas20, notas10, notas5, notas2, notas1;
        int valor = Integer.parseInt(br.readLine());

        notas100 = valor / 100;
        notas50 = valor % 100 / 50;
        notas20 = valor % 100 % 50 / 20;
        notas10 = valor % 100 % 50 % 20 / 10;
        notas5 = valor % 100 % 50 % 20 % 10 / 5;
        notas2 = valor % 100 % 50 % 20 % 10 % 5 / 2;
        notas1 = valor % 100 % 50 % 20 % 10 % 5 % 2 / 1;
                
        System.out.println(valor + "\n"
                + notas100 + " nota(s) de R$ 100,00\n"
                + notas50 + " nota(s) de R$ 50,00\n"
                + notas20 + " nota(s) de R$ 20,00\n"
                + notas10 + " nota(s) de R$ 10,00\n"
                + notas5 + " nota(s) de R$ 5,00\n"
                + notas2 + " nota(s) de R$ 2,00\n"
                + notas1 + " nota(s) de R$ 1,00");
    }
}
