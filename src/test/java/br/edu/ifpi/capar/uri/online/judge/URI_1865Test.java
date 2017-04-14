package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1865Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("4", "Hulk 5000",
                "Tony 1000", "Thor 50", "Steve 500")
                .temosAsSaidas("N\n"
                        + "N\n"
                        + "Y\n"
                        + "N");
    }
}
