package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1004Test extends URITest{

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("3", "9");
        URI_1004.main(null);
        afirmeQueResultadoEh("PROD = 27");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("-30", "10");
        URI_1004.main(null);
        afirmeQueResultadoEh("PROD = -300");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("0", "9");
        URI_1004.main(null);
        afirmeQueResultadoEh("PROD = 0");
    }
}
