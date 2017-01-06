package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1005Test extends URITest{

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("5.0", "7.1");
        URI_1005.main(null);
        afirmeQueResultadoEh("MEDIA = 6.43182");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("0.0", "7.1");
        URI_1005.main(null);
        afirmeQueResultadoEh("MEDIA = 4.84091");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("10.0", "10.0");
        URI_1005.main(null);
        afirmeQueResultadoEh("MEDIA = 10.00000");
    }
}
