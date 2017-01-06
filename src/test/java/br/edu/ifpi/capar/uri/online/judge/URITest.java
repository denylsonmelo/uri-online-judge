package br.edu.ifpi.capar.uri.online.judge;

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
public class URITest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog().muteForSuccessfulTests();
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    private String logComSeparadorNormalizado() {
        return systemOutRule.getLogWithNormalizedLineSeparator();
    }

    private String normalizarResultado(String string) {
        return string.replace('.', ',') + "\n";
    }
    
    protected void proverLinhasAoSystemIn(String... linhas) {
        systemInMock.provideLines(linhas);
    }

    protected void afirmeQueResultadoEh(String string) {
        assertThat(logComSeparadorNormalizado(), is(normalizarResultado(string)));
    }
}
