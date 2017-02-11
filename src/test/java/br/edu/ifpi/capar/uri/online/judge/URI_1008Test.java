package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1008Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("25", "100", "5.50").temosAsSaidas("NUMBER = 25\nSALARY = U$ 550.00");
        afirmeQueComAsEntradas("1", "200", "20.50").temosAsSaidas("NUMBER = 1\nSALARY = U$ 4100.00");
        afirmeQueComAsEntradas("6", "145", "15.55").temosAsSaidas("NUMBER = 6\nSALARY = U$ 2254.75");
    }
}
