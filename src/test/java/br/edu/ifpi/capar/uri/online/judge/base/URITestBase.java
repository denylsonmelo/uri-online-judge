package br.edu.ifpi.capar.uri.online.judge.base;

/**
 *
 * @author Denylson Melo
 */
public interface URITestBase {

    URITestBase afirmeQueComAsEntradas(String... entradas);

    void deveValidarExemplosDeEntradaESaidaDoSite();

    void setClass(Class clazz);

    void setNomeMetodo(String nomeMetodo);

    void temosAsSaidas(String saida);
}
