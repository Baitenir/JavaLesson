package stringBuilder_file.task1;

public class Main {
    public static void main(String[] args) {
        String text = "Maybe the moon is beautiful, only because it is far";
        String text2 = "Может луна красивая только потому что она далекая";
        String[] words = new String[]{"Hi", "Man", "Jump", "High!"};
        String word1 = "aziza";
        String word2 = "Helicopter";

        System.out.println(getReverseText(text));
        System.out.println(joinWords(words));
        System.out.println("Vowel letters count: "+getVowelLetters(text2));
        System.out.println(word1 + " is palindrome? - " + isPalindrome(word1));
        System.out.println(word2 + " is palindrome? - " + isPalindrome(word2));
        System.out.println(fixSentence(text));
        System.out.println(getLettersCount(text));
        System.out.println(convertToASCII(text));
        System.out.println(removeWhitespaces(text));

    }
    // todo methods:
    public static StringBuilder getReverseText(String text){
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse();
    }

    public static String joinWords (String[] words){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
        }
        return sb.toString();
    }

    public static int getVowelLetters(String word){
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (vowels.indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String word){
        StringBuilder word2 = new StringBuilder(word);
        word2.reverse();

        return word.equals(word2.toString());
    }

    public static String fixSentence (String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
                result.append(capitalized).append(" ");
            }
        }
        return result.toString();
    }

    public static int getLettersCount (String sentence){
        StringBuilder cleaned = new StringBuilder();
        boolean lastWasSpace = true;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (!lastWasSpace) {
                    cleaned.append(' ');
                    lastWasSpace = true;
                }
            } else {
                cleaned.append(ch);
                lastWasSpace = false;
            }
        }
        String result = cleaned.toString().trim();
        if (result.isEmpty()) {
            return 0;
        }
        String[] words = result.split(" ");
        return words.length;
    }

    public static String convertToASCII(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int ascii = (int) ch;  // Тамганы ASCII кодуна айлантабыз
            sb.append(ascii);

            // Тамгалардын ортосуна боштук коёбуз (акыркыдан башка)
            if (i != text.length() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String removeWhitespaces(String sentence) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Эгер символ боштук эмес болсо, StringBuilder'ге кошобуз
            if (!Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}

//    1. Параметирине String тибинде соз алып ал созду тескерисинен кылып кайтарган метод туз.
//
//            2. StringBuilder аркылуу создордун массивдерин алып, аларды бир сапка бириктирген метод түз.
//
//            3. Параметирине соз алып ал создун ичинде канча ундуу тамга бар экенин эсептеген метод туз.
//
//            4. StringBuilder жардамы менен берилген. соз палиндром экенин текшеруучу метод туз.
//
//            5. StringBuilder аркылуу сүйлөмдөгү ар бир сөздүн биринчи тамгасын баш тамга менен жазуучу  метод туз.
//
//            6. String жана StringBuilder жардамы менен сүйлөмдөгү сөздөрдүн санын эсептөөчу метод туз.
//
//    7. StringBuilder аркылуу ар бир тамганын өзүнүн ASCII коду менен алмаштырган метод туз.
//
//            8. StringBuilder аркылуу cуйломдон бардык боштуктарды (пробелдерди) алып салуучу метод туз.