package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1043Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("6.0 4.0 2.0").temosAsSaidas("Area = 10.0");
        afirmeQueComAsEntradas("6.0 4.0 2.1").temosAsSaidas("Perimetro = 12.1");
    }
}
