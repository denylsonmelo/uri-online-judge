package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1046Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("16 2").temosAsSaidas("O JOGO DUROU 10 HORA(S)");
        afirmeQueComAsEntradas("0 0").temosAsSaidas("O JOGO DUROU 24 HORA(S)");
        afirmeQueComAsEntradas("2 16").temosAsSaidas("O JOGO DUROU 14 HORA(S)");
    }
}
