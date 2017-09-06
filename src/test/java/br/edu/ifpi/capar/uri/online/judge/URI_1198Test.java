package br.edu.ifpi.capar.uri.online.judge;

import br.edu.ifpi.capar.uri.online.judge.base.URITestBaseImpl;
import org.junit.Test;

/**
 *
 * @author Denylson Melo
 */
public class URI_1198Test extends URITestBaseImpl {

    @Test
    @Override
    public void deveValidarExemplosDeEntradaESaidaDoSite() {
        paraAClasse(this.getClass());
        afirmeQueComAsEntradas("10 12",
                               "10 14",
                               "100 200")
                .temosAsSaidas("2\n"
                             + "4\n"
                             + "100");
        
        afirmeQueComAsEntradas("16 40",
                               "64 21",
                               "44 48",
                               "30 17",
                               "67 51",
                               "12 11",
                               "4 23",
                               "41 32",
                               "41 58",
                               "1 40",
                               "13 49",
                               "48 83",
                               "5 75",
                               "16 100",
                               "58 72",
                               "70 99",
                               "2 39",
                               "18 75",
                               "16 37",
                               "88 43",
                               "57 23")
                .temosAsSaidas("24\n"
                             + "43\n"
                             + "4\n"
                             + "13\n"
                             + "16\n"
                             + "1\n"
                             + "19\n"
                             + "9\n"
                             + "17\n"
                             + "39\n"
                             + "36\n"
                             + "35\n"
                             + "70\n"
                             + "84\n"
                             + "14\n"
                             + "29\n"
                             + "37\n"
                             + "57\n"
                             + "21\n"
                             + "45\n"
                             + "34");
    }
}
