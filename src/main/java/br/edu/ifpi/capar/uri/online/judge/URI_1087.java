package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1087 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int linhaA, colunaA, linhaB, colunaB;
        String[] valores;
        String linhaLida; 
        
        for(;!(linhaLida = br.readLine()).equals("0 0 0 0");){
            valores = linhaLida.split(" ");
            linhaA = Integer.parseInt(valores[0]);
            colunaA = Integer.parseInt(valores[1]);
            linhaB = Integer.parseInt(valores[2]);
            colunaB = Integer.parseInt(valores[3]);
            
            if(linhaA == linhaB && colunaA == colunaB)
                System.out.println(0);
            else if(linhaA == linhaB || colunaA == colunaB || Math.abs(linhaA-linhaB) == Math.abs(colunaA-colunaB))
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}
