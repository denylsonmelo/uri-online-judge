package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1004Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("3", "9").temosAsSaidas("PROD = 27");
        afirmeQueComAsEntradas("-30", "10").temosAsSaidas("PROD = -300");
        afirmeQueComAsEntradas("0", "9").temosAsSaidas("PROD = 0");
    }
}
