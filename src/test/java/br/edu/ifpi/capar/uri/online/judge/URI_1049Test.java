package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1049Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("vertebrado", "mamifero", "onivoro").temosAsSaidas("homem");
        afirmeQueComAsEntradas("vertebrado", "ave", "carnivoro").temosAsSaidas("aguia");
        afirmeQueComAsEntradas("invertebrado", "anelideo", "onivoro").temosAsSaidas("minhoca");
    }
}
