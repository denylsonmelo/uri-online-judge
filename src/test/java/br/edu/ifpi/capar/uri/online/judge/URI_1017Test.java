package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1017Test extends URITest {

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("10", "85");
        URI_1017.main(null);
        afirmeQueResultadoEh("70.833");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("2", "92");
        URI_1017.main(null);
        afirmeQueResultadoEh("15.333");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("22", "67");
        URI_1017.main(null);
        afirmeQueResultadoEh("122.833");
    }
}
