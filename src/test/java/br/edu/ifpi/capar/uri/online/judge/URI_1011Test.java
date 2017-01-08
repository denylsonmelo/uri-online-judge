package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1011Test extends URITest{

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("3");
        URI_1011.main(null);
        afirmeQueResultadoEh("VOLUME = 113.097");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("15");
        URI_1011.main(null);
        afirmeQueResultadoEh("VOLUME = 14137.155");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("1523");
        URI_1011.main(null);
        afirmeQueResultadoEh("VOLUME = 14797486501.627");
    }
}
