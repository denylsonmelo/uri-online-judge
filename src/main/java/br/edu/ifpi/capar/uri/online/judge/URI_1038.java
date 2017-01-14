package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1038 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numeros = br.readLine().split(" ");
        int quantidade = Integer.parseInt(numeros[1]);
        double total = 0;

        switch(numeros[0]){
            case "1" : total = quantidade * 4.00; break;
            case "2" : total = quantidade * 4.50; break;
            case "3" : total = quantidade * 5.00; break;
            case "4" : total = quantidade * 2.00; break;
            case "5" : total = quantidade * 1.50;
        }
        
        System.out.println(String.format("Total: R$ %.2f", total));
    }
}
