package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1005Test extends URITestBaseImpl{

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("5.0", "7.1").temosAsSaidas("MEDIA = 6.43182");
        afirmeQueComAsEntradas("0.0", "7.1").temosAsSaidas("MEDIA = 4.84091");
        afirmeQueComAsEntradas("10.0", "10.0").temosAsSaidas("MEDIA = 10.00000");
    }
}
