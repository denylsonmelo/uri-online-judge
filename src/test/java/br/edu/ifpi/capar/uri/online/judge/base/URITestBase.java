package br.edu.ifpi.capar.uri.online.judge.base;

/**
 *
 * @author Denylson Melo
 */
public interface URITestBase {

    URITestBase afirmeQueComAsEntradas(String... entradas);

    abstract void deveValidarExemplosDeEntradaESaidaDoSite();

    URITestBase paraAClasse(Class clazz);

    URITestBase paraOMetodo(String nomeMetodo);

    void temosAsSaidas(String saida);
}
