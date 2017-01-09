package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1013 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valor1, valor2, valor3, maior;

        String[] partes = br.readLine().split(" ");
        valor1 = Integer.parseInt(partes[0]);
        valor2 = Integer.parseInt(partes[1]);
        valor3 = Integer.parseInt(partes[2]);

        maior = (valor1 + valor2 + Math.abs(valor1 - valor2)) / 2;
        maior = (maior + valor3 + Math.abs(maior - valor3)) / 2;
        
        System.out.println(maior + " eh o maior");
    }
}
