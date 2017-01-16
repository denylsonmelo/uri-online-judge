package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1041 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numeros = br.readLine().split(" ");
        double posicaoX = Double.parseDouble(numeros[0]);
        double posicaoY = Double.parseDouble(numeros[1]);

        if (posicaoX == 0.0 && posicaoY == 0.0) {
            System.out.println("Origem");
        } else if (posicaoX == 0.0 && posicaoY != 0.0) {
            System.out.println("Eixo X");
        } else if (posicaoY == 0.0 && posicaoX != 0.0) {
            System.out.println("Eixo Y");
        } else if (posicaoX > 0.0 && posicaoY > 0.0) {
            System.out.println("Q1");
        } else if (posicaoX < 0.0 && posicaoY > 0.0) {
            System.out.println("Q2");
        } else if (posicaoX < 0.0 && posicaoY < 0.0) {
            System.out.println("Q3");
        } else if (posicaoX > 0.0 && posicaoY < 0.0) {
            System.out.println("Q4");
        }
    }
}
