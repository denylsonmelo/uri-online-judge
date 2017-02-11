package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1012Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("3.0 4.0 5.2")
                .temosAsSaidas("TRIANGULO: 7.800\n"
                        + "CIRCULO: 84.949\n"
                        + "TRAPEZIO: 18.200\n"
                        + "QUADRADO: 16.000\n"
                        + "RETANGULO: 12.000");
        afirmeQueComAsEntradas("12.7 10.4 15.2")
                .temosAsSaidas("TRIANGULO: 96.520\n"
                        + "CIRCULO: 725.833\n"
                        + "TRAPEZIO: 175.560\n"
                        + "QUADRADO: 108.160\n"
                        + "RETANGULO: 132.080");
    }
}
