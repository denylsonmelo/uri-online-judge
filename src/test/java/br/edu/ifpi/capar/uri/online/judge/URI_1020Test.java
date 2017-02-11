package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1020Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("400")
                .temosAsSaidas("1 ano(s)\n"
                        + "1 mes(es)\n"
                        + "5 dia(s)");
        afirmeQueComAsEntradas("800")
                .temosAsSaidas("2 ano(s)\n"
                        + "2 mes(es)\n"
                        + "10 dia(s)");
        afirmeQueComAsEntradas("30")
                .temosAsSaidas("0 ano(s)\n"
                        + "1 mes(es)\n"
                        + "0 dia(s)");
    }
}
