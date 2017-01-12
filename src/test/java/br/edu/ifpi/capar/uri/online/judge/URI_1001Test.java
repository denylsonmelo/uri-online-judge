package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1001Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("10", "9").temosAsSaidas("X = 19");
        afirmeQueComAsEntradas("-10", "4").temosAsSaidas("X = -6");
        afirmeQueComAsEntradas("15", "-7").temosAsSaidas("X = 8");
    }
}
