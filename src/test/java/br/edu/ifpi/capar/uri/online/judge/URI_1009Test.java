package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1009Test extends URITest{

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("JOAO", "500.00", "1230.30");
        URI_1009.main(null);
        afirmeQueResultadoEh("TOTAL = R$ 684.55");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("PEDRO", "700.00", "0.00");
        URI_1009.main(null);
        afirmeQueResultadoEh("TOTAL = R$ 700.00");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("MANGOJATA", "1700.00", "1230.50");
        URI_1009.main(null);
        afirmeQueResultadoEh("TOTAL = R$ 1884.58");
    }
}
