package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1015Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("1.0 7.0", "5.0 9.0").temosAsSaidas("4.4721");
        afirmeQueComAsEntradas("-2.5 0.4", "12.1 7.3").temosAsSaidas("16.1484");
        afirmeQueComAsEntradas("2.5 -0.4", "-12.2 7.0").temosAsSaidas("16.4575");
    }
}
