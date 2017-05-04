package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1045Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("7.0 5.0 7.0")
                .temosAsSaidas("TRIANGULO ACUTANGULO\n"
                             + "TRIANGULO ISOSCELES");
        afirmeQueComAsEntradas("6.0 6.0 10.0")
                .temosAsSaidas("TRIANGULO OBTUSANGULO\n"
                             + "TRIANGULO ISOSCELES");
        afirmeQueComAsEntradas("6.0 6.0 6.0")
                .temosAsSaidas("TRIANGULO ACUTANGULO\n"
                             + "TRIANGULO EQUILATERO");
        afirmeQueComAsEntradas("5.0 7.0 2.0")
                .temosAsSaidas("NAO FORMA TRIANGULO");
        afirmeQueComAsEntradas("6.0 8.0 10.0")
                .temosAsSaidas("TRIANGULO RETANGULO");
    }
}
