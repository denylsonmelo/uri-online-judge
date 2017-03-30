package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1043 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double ladoA, ladoB, ladoC;

        String[] lados = br.readLine().split(" ");
        ladoA = Double.parseDouble(lados[0]);
        ladoB = Double.parseDouble(lados[1]);
        ladoC = Double.parseDouble(lados[2]);
        
        if( ((Math.abs(ladoB - ladoC) < ladoA) && (ladoA < (ladoB + ladoC))) &&
            ((Math.abs(ladoA - ladoC) < ladoB) && (ladoB < (ladoA + ladoC))) &&
            ((Math.abs(ladoA - ladoB) < ladoC) && (ladoC < (ladoA + ladoB))) ){
            System.out.println(String.format("Perimetro = %.1f", ladoA + ladoB + ladoC));
        }else{
            System.out.println(String.format("Area = %.1f", (ladoA + ladoB) * ladoC / 2));
        }
    }
}
