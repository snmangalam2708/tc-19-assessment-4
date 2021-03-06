package rocks.zipcode.io.assessment4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] wordArray = word.toLowerCase().split("");
        for (int i = 0; i < vowels.length; i++) {
            for (int j = 0; j < wordArray.length; j++) {
                if (vowels[i].equals(wordArray[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] wordArray = word.toLowerCase().split("");

        for (int j = 0; j < wordArray.length; j++) {
            for (int i = 0; i < vowels.length; i++) {
                if (vowels[i].equals(wordArray[j])) {
                    return j;
                }
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {

        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] wordArray = word.toLowerCase().split("");
        for (int i = 0; i < vowels.length; i++) {
                if (vowels[i].equals(wordArray[0])) { return true;}
            }
        return false;
    }

    public static Boolean isVowel(Character character) {

        String s = character.toString().toLowerCase();
        String[] vowels = {"a", "e", "i", "o", "u"};
       return Arrays.stream(vowels).anyMatch(s::equals);
    }
}
