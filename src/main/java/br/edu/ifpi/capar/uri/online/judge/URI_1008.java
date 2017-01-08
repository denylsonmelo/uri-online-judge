package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1008 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numeroFuncionario, horasTrabalhadas;
        double valorDaHora;
        numeroFuncionario = Integer.parseInt(br.readLine());
        horasTrabalhadas = Integer.parseInt(br.readLine());
        valorDaHora = Double.parseDouble(br.readLine());

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println(String.format("SALARY = U$ %.2f", (valorDaHora *horasTrabalhadas)));
    }
}
