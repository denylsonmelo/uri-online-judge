package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1007 {

    public static void main(Object object) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valor1, valor2, valor3, valor4;
        valor1 = Integer.parseInt(br.readLine());
        valor2 = Integer.parseInt(br.readLine());
        valor3 = Integer.parseInt(br.readLine());
        valor4 = Integer.parseInt(br.readLine());

        System.out.println("DIFERENCA = " + (valor1 * valor2 - valor3* valor4));
    }

}
