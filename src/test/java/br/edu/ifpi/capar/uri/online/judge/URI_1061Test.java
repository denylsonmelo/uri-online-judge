package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1061Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("Dia 5", 
                               "08 : 12 : 23", 
                               "Dia 9", 
                               "06 : 13 : 23")
                .temosAsSaidas("3 dia(s)\n"
                        + "22 hora(s)\n"
                        + "1 minuto(s)\n"
                        + "0 segundo(s)");
    }
}
