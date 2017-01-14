package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1038Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("3 2").temosAsSaidas("Total: R$ 10.00");
        afirmeQueComAsEntradas("4 3").temosAsSaidas("Total: R$ 6.00");
        afirmeQueComAsEntradas("2 3").temosAsSaidas("Total: R$ 13.50");
    }
}
