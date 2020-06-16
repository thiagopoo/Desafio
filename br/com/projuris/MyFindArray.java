package br.com.projuris;

public class MyFindArray implements FindArray{

    @Override
    public int findArray(int[] array, int[] subArray) {
        int indexComparator = -1;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < subArray.length; j++){
                if (array[i] == subArray[j]){
                    indexComparator = i;
                }
            }
        }
        return indexComparator;
    }

}
