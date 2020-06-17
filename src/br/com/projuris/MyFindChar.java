package br.com.projuris;

public class MyFindChar implements FindCharachter{

    @Override
    public char findChar(String word) {
        char letter = ' ';
        for(int i = 0; i < word.length(); i++){
            int counter = 0;
            char letterMain = word.charAt(i);
            for (int j = 0; j < word.length(); j++){
                char letterComparator = word.charAt(j);
                if (letterMain == letterComparator){
                    counter += 1;
                }
            }
            if (counter < 2){
                letter = letterMain;
                break;
            }
        }
        return letter;
    }
}
