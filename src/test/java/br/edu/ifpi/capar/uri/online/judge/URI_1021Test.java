package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1021Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("576.73")
                .temosAsSaidas("NOTAS:\n"
                        + "5 nota(s) de R$ 100.00\n"
                        + "1 nota(s) de R$ 50.00\n"
                        + "1 nota(s) de R$ 20.00\n"
                        + "0 nota(s) de R$ 10.00\n"
                        + "1 nota(s) de R$ 5.00\n"
                        + "0 nota(s) de R$ 2.00\n"
                        + "MOEDAS:\n"
                        + "1 moeda(s) de R$ 1.00\n"
                        + "1 moeda(s) de R$ 0.50\n"
                        + "0 moeda(s) de R$ 0.25\n"
                        + "2 moeda(s) de R$ 0.10\n"
                        + "0 moeda(s) de R$ 0.05\n"
                        + "3 moeda(s) de R$ 0.01");
        afirmeQueComAsEntradas("4.00")
                .temosAsSaidas("NOTAS:\n"
                        + "0 nota(s) de R$ 100.00\n"
                        + "0 nota(s) de R$ 50.00\n"
                        + "0 nota(s) de R$ 20.00\n"
                        + "0 nota(s) de R$ 10.00\n"
                        + "0 nota(s) de R$ 5.00\n"
                        + "2 nota(s) de R$ 2.00\n"
                        + "MOEDAS:\n"
                        + "0 moeda(s) de R$ 1.00\n"
                        + "0 moeda(s) de R$ 0.50\n"
                        + "0 moeda(s) de R$ 0.25\n"
                        + "0 moeda(s) de R$ 0.10\n"
                        + "0 moeda(s) de R$ 0.05\n"
                        + "0 moeda(s) de R$ 0.01");
        afirmeQueComAsEntradas("91.01")
                .temosAsSaidas("NOTAS:\n"
                        + "0 nota(s) de R$ 100.00\n"
                        + "1 nota(s) de R$ 50.00\n"
                        + "2 nota(s) de R$ 20.00\n"
                        + "0 nota(s) de R$ 10.00\n"
                        + "0 nota(s) de R$ 5.00\n"
                        + "0 nota(s) de R$ 2.00\n"
                        + "MOEDAS:\n"
                        + "1 moeda(s) de R$ 1.00\n"
                        + "0 moeda(s) de R$ 0.50\n"
                        + "0 moeda(s) de R$ 0.25\n"
                        + "0 moeda(s) de R$ 0.10\n"
                        + "0 moeda(s) de R$ 0.05\n"
                        + "1 moeda(s) de R$ 0.01");

    }
}
