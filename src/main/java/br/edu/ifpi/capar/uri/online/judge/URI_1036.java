package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1036 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numeros = br.readLine().split(" ");
        double a = Double.parseDouble(numeros[0]);
        double b = Double.parseDouble(numeros[1]);
        double c = Double.parseDouble(numeros[2]);

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double raiz1, raiz2;
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println(String
                    .format("R1 = %.5f\n"
                            + "R2 = %.5f", raiz1, raiz2));
        }
    }
}
