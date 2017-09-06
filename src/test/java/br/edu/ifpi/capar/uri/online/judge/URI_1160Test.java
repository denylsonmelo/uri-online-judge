package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1160Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("6",
                               "100 150 1.0 0", 
                               "90000 120000 5.5 3.5",
                               "56700 72000 5.2 3.0",
                               "123 2000 3.0 2.0",
                               "100000 110000 1.5 0.5",
                               "62422 484317 3.1 1.0")
                .temosAsSaidas("51 anos.\n"
                        + "16 anos.\n"
                        + "12 anos.\n"
                        + "Mais de 1 seculo.\n"
                        + "10 anos.\n"
                        + "100 anos.");
    }
}
