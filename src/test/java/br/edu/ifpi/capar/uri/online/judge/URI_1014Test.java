package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1014Test extends URITest {

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("500", "35.0");
        URI_1014.main(null);
        afirmeQueResultadoEh("14.286 km/l");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("2254", "124.4");
        URI_1014.main(null);
        afirmeQueResultadoEh("18.119 km/l");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("4554", "464.6");
        URI_1014.main(null);
        afirmeQueResultadoEh("9.802 km/l");
    }
}
