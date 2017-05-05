package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1074 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int qtdNumeros, valorLido;
        qtdNumeros = Integer.parseInt(br.readLine());

        for (int i = 1; i <= qtdNumeros; i++) {
            valorLido = Integer.parseInt(br.readLine());
            if(valorLido == 0){
                System.out.println("NULL");
                continue;
            }
            if(valorLido % 2 == 0)
                System.out.print("EVEN ");
            else
                System.out.print("ODD ");
            if(valorLido > 0)
                System.out.println("POSITIVE");
            else
                System.out.println("NEGATIVE");
        }
    }
}
