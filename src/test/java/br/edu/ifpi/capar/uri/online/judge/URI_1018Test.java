package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1018Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("576")
                .temosAsSaidas("576\n"
                        + "5 nota(s) de R$ 100,00\n"
                        + "1 nota(s) de R$ 50,00\n"
                        + "1 nota(s) de R$ 20,00\n"
                        + "0 nota(s) de R$ 10,00\n"
                        + "1 nota(s) de R$ 5,00\n"
                        + "0 nota(s) de R$ 2,00\n"
                        + "1 nota(s) de R$ 1,00");
        afirmeQueComAsEntradas("11257")
                .temosAsSaidas("11257\n"
                        + "112 nota(s) de R$ 100,00\n"
                        + "1 nota(s) de R$ 50,00\n"
                        + "0 nota(s) de R$ 20,00\n"
                        + "0 nota(s) de R$ 10,00\n"
                        + "1 nota(s) de R$ 5,00\n"
                        + "1 nota(s) de R$ 2,00\n"
                        + "0 nota(s) de R$ 1,00");
        afirmeQueComAsEntradas("503")
                .temosAsSaidas("503\n"
                        + "5 nota(s) de R$ 100,00\n"
                        + "0 nota(s) de R$ 50,00\n"
                        + "0 nota(s) de R$ 20,00\n"
                        + "0 nota(s) de R$ 10,00\n"
                        + "0 nota(s) de R$ 5,00\n"
                        + "1 nota(s) de R$ 2,00\n"
                        + "1 nota(s) de R$ 1,00");
    }
}
