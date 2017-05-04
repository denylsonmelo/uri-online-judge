package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1073 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valorLido = Integer.parseInt(br.readLine());

        for (int par = 2; par < valorLido; par = par + 2) {
            System.out.println(par + "^2 = " + (int) Math.pow(par, 2));
        }
        if(valorLido % 2 == 0)
            System.out.println(valorLido + "^2 = " + (int) Math.pow(valorLido, 2));
    }
}
