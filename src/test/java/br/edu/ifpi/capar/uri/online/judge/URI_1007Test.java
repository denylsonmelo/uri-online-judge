package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1007Test extends URITest{

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("5", "6", "7", "8");
        URI_1007.main(null);
        afirmeQueResultadoEh("DIFERENCA = -26");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("0", "0", "7", "8");
        URI_1007.main(null);
        afirmeQueResultadoEh("DIFERENCA = -56");
    }
    
    @Test
    public void deveValidarExemplosEntradaSaidaDoSite3() throws IOException {
        proverLinhasAoSystemIn("5", "6", "-7", "8");
        URI_1007.main(null);
        afirmeQueResultadoEh("DIFERENCA = 86");
    }
}
