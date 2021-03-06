package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1101Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("5 2", "6 3", "5 0")
                .temosAsSaidas("2 3 4 5 Sum=14\n"
                             + "3 4 5 6 Sum=18");
    }
}
