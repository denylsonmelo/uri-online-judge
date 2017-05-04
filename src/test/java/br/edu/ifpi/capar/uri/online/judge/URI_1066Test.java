package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1066Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("-5", "0", "-3", "-4", "12")
                .temosAsSaidas("3 valor(es) par(es)\n"
                        + "2 valor(es) impar(es)\n"
                        + "1 valor(es) positivo(s)\n"
                        + "3 valor(es) negativo(s)");
    }
}
