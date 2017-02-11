package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1037Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("25.01").temosAsSaidas("Intervalo (25,50]");
        afirmeQueComAsEntradas("25.00").temosAsSaidas("Intervalo [0,25]");
        afirmeQueComAsEntradas("100.00").temosAsSaidas("Intervalo (75,100]");
        afirmeQueComAsEntradas("-25.02").temosAsSaidas("Fora de intervalo");
    }
}
