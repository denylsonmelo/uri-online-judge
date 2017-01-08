package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1010Test extends URITest{

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("12 1 5.30", "16 2 5.10");
        URI_1010.main(null);
        afirmeQueResultadoEh("VALOR A PAGAR: R$ 15.50");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("13 2 15.30", "161 4 5.20");
        URI_1010.main(null);
        afirmeQueResultadoEh("VALOR A PAGAR: R$ 51.40");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("1 1 15.10", "2 1 15.10");
        URI_1010.main(null);
        afirmeQueResultadoEh("VALOR A PAGAR: R$ 30.20");
    }
}
