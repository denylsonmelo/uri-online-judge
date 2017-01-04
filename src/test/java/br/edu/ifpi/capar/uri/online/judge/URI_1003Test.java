package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1003Test extends URITest{

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("30", "10");
        URI_1003.main(null);
        afirmeQueResultadoEh("SOMA = 40");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("-30", "10");
        URI_1003.main(null);
        afirmeQueResultadoEh("SOMA = -20");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("0", "0");
        URI_1003.main(null);
        afirmeQueResultadoEh("SOMA = 0");
    }
}
