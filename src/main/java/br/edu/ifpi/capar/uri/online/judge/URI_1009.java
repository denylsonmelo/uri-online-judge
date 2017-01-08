package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double salarioFixo, totalVendas;
        br.readLine();
        salarioFixo = Double.parseDouble(br.readLine());
        totalVendas = Double.parseDouble(br.readLine());

        System.out.println(String.format("TOTAL = R$ %.2f", salarioFixo + (totalVendas * 0.15)));
    }
}
