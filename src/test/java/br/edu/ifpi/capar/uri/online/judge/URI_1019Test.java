package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1019Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("556").temosAsSaidas("0:9:16");
        afirmeQueComAsEntradas("1").temosAsSaidas("0:0:1");
        afirmeQueComAsEntradas("140153").temosAsSaidas("38:55:53");
    }
}
