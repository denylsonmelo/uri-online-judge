package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1074Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("4", "-5", "0", "3", "-4")
                .temosAsSaidas("ODD NEGATIVE\n"
                        + "NULL\n"
                        + "ODD POSITIVE\n"
                        + "EVEN NEGATIVE");
    }
}
