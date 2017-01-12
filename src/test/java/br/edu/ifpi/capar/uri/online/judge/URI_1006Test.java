package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1006Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("5.0", "6.0", "7.0").temosAsSaidas("MEDIA = 6.3");
        afirmeQueComAsEntradas("5.0", "10.0", "10.0").temosAsSaidas("MEDIA = 9.0");
        afirmeQueComAsEntradas("10.0", "10.0", "5.0").temosAsSaidas("MEDIA = 7.5");
    }
}
