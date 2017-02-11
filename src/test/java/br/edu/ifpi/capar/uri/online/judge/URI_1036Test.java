package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1036Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("10.0 20.1 5.1")
                .temosAsSaidas("R1 = -0.29788\n"
                        + "R2 = -1.71212");
        afirmeQueComAsEntradas("0.0 20.0 5.0").temosAsSaidas("Impossivel calcular");
        afirmeQueComAsEntradas("10.3 203.0 5.0")
                .temosAsSaidas("R1 = -0.02466\n"
                        + "R2 = -19.68408");
        afirmeQueComAsEntradas("10.0 3.0 5.0").temosAsSaidas("Impossivel calcular");
    }
}
