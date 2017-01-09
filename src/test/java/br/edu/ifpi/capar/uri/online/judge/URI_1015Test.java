package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1015Test extends URITest {

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("1.0 7.0", "5.0 9.0");
        URI_1015.main(null);
        afirmeQueResultadoEh("4.4721");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("-2.5 0.4", "12.1 7.3");
        URI_1015.main(null);
        afirmeQueResultadoEh("16.1484");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("2.5 -0.4", "-12.2 7.0");
        URI_1015.main(null);
        afirmeQueResultadoEh("16.4575");
    }
}
