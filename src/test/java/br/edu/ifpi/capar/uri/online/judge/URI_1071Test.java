package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1071Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("6", "-5").temosAsSaidas("5");
        afirmeQueComAsEntradas("15", "12").temosAsSaidas("13");
        afirmeQueComAsEntradas("12", "12").temosAsSaidas("0");
    }
}
