package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1009Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("JOAO", "500.00", "1230.30").temosAsSaidas("TOTAL = R$ 684.55");
        afirmeQueComAsEntradas("PEDRO", "700.00", "0.00").temosAsSaidas("TOTAL = R$ 700.00");
        afirmeQueComAsEntradas("MANGOJATA", "1700.00", "1230.50").temosAsSaidas("TOTAL = R$ 1884.58");
    }
}
