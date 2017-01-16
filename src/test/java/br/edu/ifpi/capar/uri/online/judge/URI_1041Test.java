package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1041Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("4.5 -2.2").temosAsSaidas("Q4");
        afirmeQueComAsEntradas("0.1 0.1").temosAsSaidas("Q1");
        afirmeQueComAsEntradas("0.0 0.0").temosAsSaidas("Origem");
    }
}
