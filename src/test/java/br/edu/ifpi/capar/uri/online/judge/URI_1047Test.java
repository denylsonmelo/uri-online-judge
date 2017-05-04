package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1047Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("7 8 9 10").temosAsSaidas("O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)");
        afirmeQueComAsEntradas("7 7 7 7").temosAsSaidas("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        afirmeQueComAsEntradas("7 10 8 9").temosAsSaidas("O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)");
    }
}
