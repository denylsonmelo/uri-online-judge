package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final double pi = 3.14159;
        double valorA, valorB, valorC, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        String[] partes = br.readLine().split(" ");

        valorA = Double.parseDouble(partes[0]);
        valorB = Double.parseDouble(partes[1]);
        valorC = Double.parseDouble(partes[2]);
        
        areaTriangulo = valorA * valorC / 2;
        areaCirculo = pi * Math.pow(valorC, 2);
        areaTrapezio = (valorA + valorB) * valorC / 2;
        areaQuadrado = Math.pow(valorB, 2);
        areaRetangulo = valorA * valorB;
        
        System.out.println(String.format("TRIANGULO: %.3f\n"
                + "CIRCULO: %.3f\n"
                + "TRAPEZIO: %.3f\n"
                + "QUADRADO: %.3f\n"
                + "RETANGULO: %.3f", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo));
    }
}
