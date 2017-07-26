package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Denylson Melo
 */
public class URI_1101 {

    public static void main(String[] args) throws IOException {
        String[] linhas;
        int m, n, maior, menor, soma;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(;;){
            linhas = br.readLine().split(" ");
            m = Integer.parseInt(linhas[0]);
            n = Integer.parseInt(linhas[1]);
            
            if(m <= 0 || n <= 0){
                break;
            }else if(m >= n){
                maior = m;
                menor = n;
            }else{
                maior = n;
                menor = m;
            }
            
            soma = 0;
            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);
        }
        
    }
}
