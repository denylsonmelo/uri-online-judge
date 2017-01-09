package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1013Test extends URITest {

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("7 14 106");
        URI_1013.main(null);
        afirmeQueResultadoEh("106 eh o maior");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("217 14 6");
        URI_1013.main(null);
        afirmeQueResultadoEh("217 eh o maior");
    }
}
