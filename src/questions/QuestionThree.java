package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 3. Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para
 * formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de
 * substrings que são anagramas.
 *
 * Exemplo:
 *
 * Exemplo 1)
 * Entrada:
 * ovo
 *
 * Saída:
 * 3
 *
 * Explicação:
 * A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1], [1, 2]]
 * respectivamente.
 *
 * Exemplo 2)
 * Entrada:
 * ifailuhkqq
 *
 * Saída:
 * 3
 *
 * Explicação:
 * A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]], [[8, 9]] e
 * [[0, 1, 2], [1, 2, 3]].
 */
public class QuestionThree {

    /**
     * Retorna o número de anagramas contido na palavra.
     * @param word @{@link String} palavra.
     * @return int número de anagramas.
     */
    public static int getNumberOfWordsAnagrams(String word) {
        int anagrams = 0;

        ArrayList<String> subStrings = new ArrayList<String>();

        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j <= word.length() - i; j++) {
                subStrings.add(word.substring(j, j + i));
            }
        }

        for (int i = 0; i < subStrings.size(); i++) {
            for (int j = i + 1; j < subStrings.size(); j++) {
                if (compateWordsAnagrams(subStrings.get(i), subStrings.get(j))) anagrams++;
            }
        }

        return anagrams;
    }

    /**
     * Compara suas palavras e verifica são anagramas entre si.
     * @param a @{@link String} primeira palavra.
     * @param b @{@link String} segunda palavra.
     * @return boolean true se as palavras são anagramas, caso contrário, false.
     */
    public static boolean compateWordsAnagrams(String a, String b) {
        char aChars[] = a.toCharArray();
        char bChars[] = b.toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);

        String aStringSroted = new String(aChars);
        String bStringSroted = new String(bChars);

        return aStringSroted.equals(bStringSroted);
    }

    public static void main(String[] args) {
        System.out.println(getNumberOfWordsAnagrams("ovo"));
        System.out.println(getNumberOfWordsAnagrams("ifailuhkqq"));
    }

}