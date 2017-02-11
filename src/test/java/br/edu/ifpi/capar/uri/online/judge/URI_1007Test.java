package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1007Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("5", "6", "7", "8").temosAsSaidas("DIFERENCA = -26");
        afirmeQueComAsEntradas("0", "0", "7", "8").temosAsSaidas("DIFERENCA = -56");
        afirmeQueComAsEntradas("5", "6", "-7", "8").temosAsSaidas("DIFERENCA = 86");
    }
}
