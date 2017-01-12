package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1017Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("10", "85").temosAsSaidas("70.833");
        afirmeQueComAsEntradas("2", "92").temosAsSaidas("15.333");
        afirmeQueComAsEntradas("22", "67").temosAsSaidas("122.833");
    }
}
