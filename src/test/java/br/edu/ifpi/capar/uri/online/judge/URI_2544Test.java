package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_2544Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("1", "2", "4")
                .temosAsSaidas("0\n"
                             + "1\n"
                             + "2");
    }
}
