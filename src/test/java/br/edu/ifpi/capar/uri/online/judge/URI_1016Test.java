package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1016Test extends URITest {

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("30");
        URI_1016.main(null);
        afirmeQueResultadoEh("60 minutos");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("110");
        URI_1016.main(null);
        afirmeQueResultadoEh("220 minutos");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("7");
        URI_1016.main(null);
        afirmeQueResultadoEh("14 minutos");
    }
}
