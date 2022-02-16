package questions;

/**
 * 1. Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e
 * altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
 *
 * Exemplo:
 * Entrada:
 * n = 6
 *
 * Saída:
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 * ******
 */
public class QuestionOne {

    /**
     * Gera a escada de "*".
     * @param n número de linhas da escada.
     * @return @{@link String} que representa a escada.
     */
    public static String generateLadder(int n) {
        String result = "";

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n - i; j++) result += " ";

            for (int j = 0; j < i; j++) result += "*";

            result += "\n";
        }

        return result;
    }

}