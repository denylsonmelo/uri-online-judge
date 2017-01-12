package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1010Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("12 1 5.30", "16 2 5.10").temosAsSaidas("VALOR A PAGAR: R$ 15.50");
        afirmeQueComAsEntradas("13 2 15.30", "161 4 5.20").temosAsSaidas("VALOR A PAGAR: R$ 51.40");
        afirmeQueComAsEntradas("1 1 15.10", "2 1 15.10").temosAsSaidas("VALOR A PAGAR: R$ 30.20");
    }
}
