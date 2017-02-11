package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1016Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("30").temosAsSaidas("60 minutos");
        afirmeQueComAsEntradas("110").temosAsSaidas("220 minutos");
        afirmeQueComAsEntradas("7").temosAsSaidas("14 minutos");
    }
}
