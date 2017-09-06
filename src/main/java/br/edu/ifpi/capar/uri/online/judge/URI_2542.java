package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_2542 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numeroAtributos, quantDeckMarcos, quantDeckLeonardo, cartaMarcos, cartaLeonardo, atributoSorteado, valorMarcos, valorLeonardo;
        int[][] deckMarcos, deckLeonardo;
        String linhaLida;
        String[] valores;

        while ((linhaLida = br.readLine()) != null) {
            numeroAtributos = Integer.parseInt(linhaLida);

            valores = br.readLine().split(" ");
            quantDeckMarcos = Integer.parseInt(valores[0]);
            quantDeckLeonardo = Integer.parseInt(valores[1]);

            deckMarcos = new int[quantDeckMarcos][numeroAtributos];
            for (int i = 0; i < quantDeckMarcos; i++) {
                valores = br.readLine().split(" ");
                for (int j = 0; j < numeroAtributos; j++) {
                    deckMarcos[i][j] = Integer.parseInt(valores[j]);
                }
            }

            deckLeonardo = new int[quantDeckLeonardo][numeroAtributos];
            for (int i = 0; i < quantDeckLeonardo; i++) {
                valores = br.readLine().split(" ");
                for (int j = 0; j < numeroAtributos; j++) {
                    deckLeonardo[i][j] = Integer.parseInt(valores[j]);
                }
            }

            valores = br.readLine().split(" ");
            cartaMarcos = Integer.parseInt(valores[0]);
            cartaLeonardo = Integer.parseInt(valores[1]);

            atributoSorteado = Integer.parseInt(br.readLine());

            valorMarcos = deckMarcos[cartaMarcos - 1][atributoSorteado - 1];
            valorLeonardo = deckLeonardo[cartaLeonardo - 1][atributoSorteado - 1];
            if (valorMarcos < valorLeonardo) {
                System.out.println("Leonardo");
            } else if (valorMarcos > valorLeonardo) {
                System.out.println("Marcos");
            } else {
                System.out.println("Empate");
            }
        }
    }
}
