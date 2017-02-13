package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Denylson Melo
 */
public class URI_1052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> meses = new HashMap<>();
        meses.put(1, "January");
        meses.put(2, "February");
        meses.put(3, "March");
        meses.put(4, "April");
        meses.put(5, "May");
        meses.put(6, "June");
        meses.put(7, "July");
        meses.put(8, "August");
        meses.put(9, "September");
        meses.put(10, "October");
        meses.put(11, "November");
        meses.put(12, "December");

        int numeroMes = Integer.parseInt(br.readLine());

        for (Map.Entry<Integer, String> mes : meses.entrySet()) {
            if (mes.getKey().equals(numeroMes)) {
                System.out.println(mes.getValue());
                break;
            }
        }
    }
}
