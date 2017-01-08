package br.edu.ifpi.capar.uri.online.judge;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1012Test extends URITest {

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite1() throws IOException {
        proverLinhasAoSystemIn("3.0 4.0 5.2");
        URI_1012.main(null);
        afirmeQueResultadoEh("TRIANGULO: 7.800\n"
                + "CIRCULO: 84.949\n"
                + "TRAPEZIO: 18.200\n"
                + "QUADRADO: 16.000\n"
                + "RETANGULO: 12.000");
    }

    @Test
    public void deveValidarExemplosEntradaSaidaDoSite2() throws IOException {
        proverLinhasAoSystemIn("12.7 10.4 15.2");
        URI_1012.main(null);
        afirmeQueResultadoEh("TRIANGULO: 96.520\n"
                + "CIRCULO: 725.833\n"
                + "TRAPEZIO: 175.560\n"
                + "QUADRADO: 108.160\n"
                + "RETANGULO: 132.080");
    }
}
