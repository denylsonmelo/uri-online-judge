package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1035 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numeros = br.readLine().split(" ");
        int a = Integer.parseInt(numeros[0]);
        int b = Integer.parseInt(numeros[1]);
        int c = Integer.parseInt(numeros[2]);
        int d = Integer.parseInt(numeros[3]);

        if (b > c && d > a && ((c + d) > (a + b)) && c > 0 && d > 0 && (a % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}
