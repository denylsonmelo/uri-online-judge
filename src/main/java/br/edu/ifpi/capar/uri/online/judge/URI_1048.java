package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1048 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int percentual = 0;
        double salarioNovo, reajuste, salario;
        salario = Double.parseDouble(br.readLine());

        if (salario >= 0 && salario <= 400.00) {
            percentual = 15;
        } else if (salario > 400.00 && salario <= 800.00) {
            percentual = 12;
        } else if (salario > 800.00 && salario <= 1200.00) {
            percentual = 10;
        } else if (salario > 1200.00 && salario <= 2000.00) {
            percentual = 7;
        } else if (salario > 2000.00) {
            percentual = 4;
        }

        reajuste = salario * percentual / 100;
        salarioNovo = salario + reajuste;

        System.out.println(String.format("Novo salario: %.2f\n"
                + "Reajuste ganho: %.2f\n"
                + "Em percentual: %d %%", salarioNovo, reajuste, percentual));
    }
}
