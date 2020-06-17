package br.com.projuris;

public class MyFindArray implements FindArray{

    @Override
    public int findArray(int[] array, int[] subArray) {
        int indexReturn = -1;
        int indexComparator = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == subArray[indexComparator]){
                indexComparator ++;
                if (indexComparator == subArray.length) {
                    indexReturn = i - (subArray.length - 1);
                    indexComparator = 0;
                }
            } else {
                indexComparator = 0;
            }
        }
        return indexReturn;
    }

}
