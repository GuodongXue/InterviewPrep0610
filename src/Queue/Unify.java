package Queue;

import java.util.HashSet;
import java.util.Set;

public class Unify {public int countConsistentStrings(String allowed, String[] words) {
    int n = 0;
    char[] allowedChars = allowed.toCharArray();
    Set<String> allowedSet = new HashSet<>();

    for(char ac: allowedChars){
        allowedSet.add(String.valueOf(ac));
    }



    for(String word: words){
        char[] wordsChar = word.toCharArray();
        Set<String> wordSet = new HashSet<>();
        wordSet.add(word);
        if(allowedSet.containsAll(wordSet)){
            n++;
        }
    }

    return n;

}

}
