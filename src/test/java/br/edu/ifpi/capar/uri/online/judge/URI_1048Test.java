package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1048Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        setClass(this.getClass());
        afirmeQueComAsEntradas("400.00")
                .temosAsSaidas("Novo salario: 460.00\n"
                        + "Reajuste ganho: 60.00\n"
                        + "Em percentual: 15 %");
        afirmeQueComAsEntradas("800.01")
                .temosAsSaidas("Novo salario: 880.01\n"
                        + "Reajuste ganho: 80.00\n"
                        + "Em percentual: 10 %");
        afirmeQueComAsEntradas("2000.00")
                .temosAsSaidas("Novo salario: 2140.00\n"
                        + "Reajuste ganho: 140.00\n"
                        + "Em percentual: 7 %");
    }
}
