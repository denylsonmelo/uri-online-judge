package br.edu.ifpi.capar.uri.online.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Denylson Melo
 */
public class URI_1050 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean codigoExistente = false;
        Map<Integer, String> codigos = new HashMap<>();
        codigos.put(11, "Sao Paulo");
        codigos.put(19, "Campinas");
        codigos.put(21, "Rio de Janeiro");
        codigos.put(27, "Vitoria");
        codigos.put(31, "Belo Horizonte");
        codigos.put(32, "Juiz de Fora");
        codigos.put(61, "Brasilia");
        codigos.put(71, "Salvador");

        int ddd = Integer.parseInt(br.readLine());

        for (Map.Entry<Integer, String> codigo : codigos.entrySet()) {
            if (codigo.getKey().equals(ddd)) {
                System.out.println(codigo.getValue());
                codigoExistente = true;
                break;
            }
        }
        if (!codigoExistente) {
            System.out.println("DDD nao cadastrado");
        }
    }
}
