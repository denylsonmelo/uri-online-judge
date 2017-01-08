package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1010 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quantidade;
        double valor, total = 0;

        for (String linha = br.readLine(); linha != null; linha = br.readLine()) {
            String[] partes = linha.split(" ");
            quantidade = Integer.parseInt(partes[1]);
            valor = Double.parseDouble(partes[2]);
            total += quantidade * valor;
        }

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
}
