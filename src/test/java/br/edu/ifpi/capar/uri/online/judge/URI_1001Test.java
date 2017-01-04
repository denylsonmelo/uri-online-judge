package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1001Test extends URITest{

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("10", "9");
        URI_1001.main(null);
        afirmeQueResultadoEh("X = 19");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("-10", "4");
        URI_1001.main(null);
        afirmeQueResultadoEh("X = -6");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("15", "-7");
        URI_1001.main(null);
        afirmeQueResultadoEh("X = 8");
    }
}
