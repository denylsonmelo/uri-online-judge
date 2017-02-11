package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1014Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("500", "35.0").temosAsSaidas("14.286 km/l");
        afirmeQueComAsEntradas("2254", "124.4").temosAsSaidas("18.119 km/l");
        afirmeQueComAsEntradas("4554", "464.6").temosAsSaidas("9.802 km/l");
    }
}
