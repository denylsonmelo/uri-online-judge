package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Denylson Melo
 */
public class URI_1049 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<List<String>, String> classificacoes = new HashMap<>();
        classificacoes.put(Arrays.asList("vertebrado", "ave", "carnivoro"), "aguia");
        classificacoes.put(Arrays.asList("vertebrado", "ave", "onivoro"), "pomba");
        classificacoes.put(Arrays.asList("vertebrado", "mamifero", "onivoro"), "homem");
        classificacoes.put(Arrays.asList("vertebrado", "mamifero", "herbivoro"), "vaca");
        classificacoes.put(Arrays.asList("invertebrado", "inseto", "hematofago"), "pulga");
        classificacoes.put(Arrays.asList("invertebrado", "inseto", "herbivoro"), "lagarta");
        classificacoes.put(Arrays.asList("invertebrado", "anelideo", "hematofago"), "sanguessuga");
        classificacoes.put(Arrays.asList("invertebrado", "anelideo", "onivoro"), "minhoca");

        String palavra1, palavra2, palavra3;
        palavra1 = br.readLine();
        palavra2 = br.readLine();
        palavra3 = br.readLine();

        List<String> palavras = Arrays.asList(palavra1, palavra2, palavra3);
        
        for (Map.Entry<List<String>, String> classificacao : classificacoes.entrySet()) {
            if (classificacao.getKey().equals(palavras)) {
                System.out.println(classificacao.getValue());
                break;
            }
        }
    }
}
