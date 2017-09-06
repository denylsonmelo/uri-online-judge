package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1087Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("4 4 6 2",
                               "3 5 3 5",
                               "5 5 4 3",
                               "0 0 0 0")
                .temosAsSaidas("1\n"
                        + "0\n"
                        + "2");
    }
}
