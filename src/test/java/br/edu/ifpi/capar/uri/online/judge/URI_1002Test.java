package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1002Test extends URITest{

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("2.00");
        URI_1002.main(null);
        afirmeQueResultadoEh("A=12.5664");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("100.64");
        URI_1002.main(null);
        afirmeQueResultadoEh("A=31819.3103");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("150.00");
        URI_1002.main(null);
        afirmeQueResultadoEh("A=70685.7750");
    }
}
