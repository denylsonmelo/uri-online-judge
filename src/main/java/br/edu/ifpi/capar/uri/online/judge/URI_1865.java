package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1865 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quantidadeDeDados;

        quantidadeDeDados = Integer.parseInt(br.readLine());

        for (int i = 0; i < quantidadeDeDados; i++) {
            String[] valores = br.readLine().split(" ");
            if (valores[0].equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
