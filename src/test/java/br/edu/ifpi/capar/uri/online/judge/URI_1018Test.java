package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1018Test extends URITest {

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("576");
        URI_1018.main(null);
        afirmeQueResultadoEh("576\n"
                + "5 nota(s) de R$ 100,00\n"
                + "1 nota(s) de R$ 50,00\n"
                + "1 nota(s) de R$ 20,00\n"
                + "0 nota(s) de R$ 10,00\n"
                + "1 nota(s) de R$ 5,00\n"
                + "0 nota(s) de R$ 2,00\n"
                + "1 nota(s) de R$ 1,00");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("11257");
        URI_1018.main(null);
        afirmeQueResultadoEh("11257\n"
                + "112 nota(s) de R$ 100,00\n"
                + "1 nota(s) de R$ 50,00\n"
                + "0 nota(s) de R$ 20,00\n"
                + "0 nota(s) de R$ 10,00\n"
                + "1 nota(s) de R$ 5,00\n"
                + "1 nota(s) de R$ 2,00\n"
                + "0 nota(s) de R$ 1,00");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("503");
        URI_1018.main(null);
        afirmeQueResultadoEh("503\n"
                + "5 nota(s) de R$ 100,00\n"
                + "0 nota(s) de R$ 50,00\n"
                + "0 nota(s) de R$ 20,00\n"
                + "0 nota(s) de R$ 10,00\n"
                + "0 nota(s) de R$ 5,00\n"
                + "1 nota(s) de R$ 2,00\n"
                + "1 nota(s) de R$ 1,00");
    }
}
