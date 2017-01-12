package br.edu.ifpi.capar.uri.online.judge.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

/**
 *
 * @author Denylson Melo
 */
public abstract class URITestBaseImpl implements URITestBase {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog().muteForSuccessfulTests();
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();
    private String[] dados;
    private Class clazz;
    private String nomeMetodo = "main";

    @Override
    public URITestBaseImpl afirmeQueComAsEntradas(String... entradas) {
        this.dados = entradas;
        return this;
    }

    @Override
    public void temosAsSaidas(String saida) {
        proverLinhasAoSystemIn(dados);
        executarMetodoPorReflection();
        afirmeQueResultadoEh(saida);
        limparSystemOut();
    }

    @Override
    public abstract void deveValidarExemplosDeEntradaESaidaDoSite();

    @Override
    public void setClass(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public void setNomeMetodo(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
    }

    private void limparSystemOut() {
        systemOutRule.clearLog();
    }

    private String logComSeparadorNormalizado() {
        return systemOutRule.getLogWithNormalizedLineSeparator();
    }

    private String normalizarResultado(String string) {
        return string.replace('.', ',') + "\n";
    }

    private void proverLinhasAoSystemIn(String... linhas) {
        systemInMock.provideLines(linhas);
    }

    private void afirmeQueResultadoEh(String string) {
        assertThat(logComSeparadorNormalizado(), is(normalizarResultado(string)));
    }

    private void executarMetodoPorReflection() {
        try {
            Class<?> forName = Class.forName(clazz.getCanonicalName().replace("Test", ""));
            Method declaredMethod = forName.getDeclaredMethod(nomeMetodo, String[].class);
            declaredMethod.invoke(null, (Object) null);
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException ex) {
            Logger.getLogger(URITestBaseImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
