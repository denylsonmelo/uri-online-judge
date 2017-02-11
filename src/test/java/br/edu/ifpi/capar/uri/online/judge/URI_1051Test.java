package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1051Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("3002.00").temosAsSaidas("R$ 80.36");
        afirmeQueComAsEntradas("1701.12").temosAsSaidas("Isento");
        afirmeQueComAsEntradas("4520.00").temosAsSaidas("R$ 355.60");
    }
}
