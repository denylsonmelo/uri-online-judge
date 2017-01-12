package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1002Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("2.00").temosAsSaidas("A=12.5664");
        afirmeQueComAsEntradas("100.64").temosAsSaidas("A=31819.3103");
        afirmeQueComAsEntradas("150.00").temosAsSaidas("A=70685.7750");
    }
}
