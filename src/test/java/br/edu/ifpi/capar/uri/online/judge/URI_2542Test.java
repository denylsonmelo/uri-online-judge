package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_2542Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("3",
                               "2 2",
                               "3 8 1",
                               "6 7 9",
                               "1 2 3",
                               "8 4 1",
                               "1 2",
                               "2")
                .temosAsSaidas("Marcos");
    }
}
