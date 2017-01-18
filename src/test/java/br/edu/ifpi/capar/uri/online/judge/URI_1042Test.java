package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1042Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("7 21 -14")
                .temosAsSaidas("-14\n"
                        + "7\n"
                        + "21\n"
                        + "\n"
                        + "7\n"
                        + "21\n"
                        + "-14");
        afirmeQueComAsEntradas("-14 21 7")
                .temosAsSaidas("-14\n"
                        + "7\n"
                        + "21\n"
                        + "\n"
                        + "-14\n"
                        + "21\n"
                        + "7");
    }
}
