package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1008Test extends URITest{

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("25", "100", "5.50");
        URI_1008.main(null);
        afirmeQueResultadoEh("NUMBER = 25\nSALARY = U$ 550.00");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("1", "200", "20.50");
        URI_1008.main(null);
        afirmeQueResultadoEh("NUMBER = 1\nSALARY = U$ 4100.00");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("6", "145", "15.55");
        URI_1008.main(null);
        afirmeQueResultadoEh("NUMBER = 6\nSALARY = U$ 2254.75");
    }
}
