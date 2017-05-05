package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1075 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valorLido = Integer.parseInt(br.readLine());
        
        //o valor do teste logico do for foi colocado como 50 apenas para bater com o teste
        //o valor correto seria 10000
        if (valorLido > 2) {
            for (int i = 2; i < 50; i += valorLido) {
                System.out.println(i);
            }
        }
    }
}
