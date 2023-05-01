package org.dmashnikov.factory;

public class ChoiceSorter implements ArraySorter {
    private int[] sortArr;

    public ChoiceSorter(int[] sortedArray) {
        this.sortArr = sortedArray;
    }

    @Override
    public int[] sort() {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            int min = sortArr[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            //меняем местами наименьший с sortArr[i]
            sortArr[i] = min;
        }
        return sortArr;
    }
}
