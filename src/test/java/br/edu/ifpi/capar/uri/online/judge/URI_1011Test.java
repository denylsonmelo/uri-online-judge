package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1011Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("3").temosAsSaidas("VOLUME = 113.097");
        afirmeQueComAsEntradas("15").temosAsSaidas("VOLUME = 14137.155");
        afirmeQueComAsEntradas("1523").temosAsSaidas("VOLUME = 14797486501.627");
    }
}
