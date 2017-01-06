package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1006Test extends URITest{

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("5.0", "6.0", "7.0");
        URI_1006.main(null);
        afirmeQueResultadoEh("MEDIA = 6.3");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("5.0", "10.0", "10.0");
        URI_1006.main(null);
        afirmeQueResultadoEh("MEDIA = 9.0");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("10.0", "10.0", "5.0");
        URI_1006.main(null);
        afirmeQueResultadoEh("MEDIA = 7.5");
    }
}
