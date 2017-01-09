package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1015 {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x1, x2, y1, y2;
        
        String[] linha = br.readLine().split(" ");
        x1 = Double.parseDouble(linha[0]);
        y1 = Double.parseDouble(linha[1]);
        linha = br.readLine().split(" ");
        x2 = Double.parseDouble(linha[0]);
        y2 = Double.parseDouble(linha[1]);
        
        System.out.println(String.format("%.4f", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));
    }
}
