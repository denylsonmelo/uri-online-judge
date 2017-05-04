package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1044 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valorA, valorB;

        String[] valores = br.readLine().split(" ");
        valorA = Integer.parseInt(valores[0]);
        valorB = Integer.parseInt(valores[1]);
        
        if(valorA % valorB == 0 || valorB % valorA == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
