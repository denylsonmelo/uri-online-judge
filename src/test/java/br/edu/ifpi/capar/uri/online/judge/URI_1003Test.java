package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1003Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("30", "10").temosAsSaidas("SOMA = 40");
        afirmeQueComAsEntradas("-30", "10").temosAsSaidas("SOMA = -20");
        afirmeQueComAsEntradas("0", "0").temosAsSaidas("SOMA = 0");
    }
}
