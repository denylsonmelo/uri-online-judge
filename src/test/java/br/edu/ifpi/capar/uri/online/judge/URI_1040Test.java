package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1040Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("2.0 4.0 7.5 8.0", "6.4")
                .temosAsSaidas("Media: 5.4\n"
                        + "Aluno em exame.\n"
                        + "Nota do exame: 6.4\n"
                        + "Aluno aprovado.\n"
                        + "Media final: 5.9");
        afirmeQueComAsEntradas("2.0 6.5 4.0 9.0")
                .temosAsSaidas("Media: 4.8\n"
                        + "Aluno reprovado.");
        afirmeQueComAsEntradas("9.0 4.0 8.5 9.0")
                .temosAsSaidas("Media: 7.3\n"
                        + "Aluno aprovado.");
        afirmeQueComAsEntradas("2.0 4.0 7.5 8.0", "4.5")
                .temosAsSaidas("Media: 5.4\n"
                        + "Aluno em exame.\n"
                        + "Nota do exame: 4.5\n"
                        + "Aluno reprovado.\n"
                        + "Media final: 4.9");
    }
}
