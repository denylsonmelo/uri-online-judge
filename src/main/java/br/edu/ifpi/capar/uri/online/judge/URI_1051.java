package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1051 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isento = false;
        double salario, valorDevido = 0;
        salario = Double.parseDouble(br.readLine());

        if (salario <= 2000.00) {
            isento = true;
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            valorDevido = (salario - 2000) * 0.08;
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            valorDevido = 1000 * 0.08;
            valorDevido += (salario - 3000) * 0.18;
        } else if (salario >= 4500.01) {
            valorDevido = 1000 * 0.08;
            valorDevido += 1500 * 0.18;
            valorDevido += (salario - 4500) * 0.28;
        }
        if (isento) {
            System.out.println("Isento");
        } else {
            System.out.println(String.format("R$ %.2f", valorDevido));
        }
    }
}
