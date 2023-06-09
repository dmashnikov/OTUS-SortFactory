package org.dmashnikov.factory;

public class PasteSorter implements ArraySorter {
    private int[] sortArr;

    public PasteSorter(int[] sortedArray) {
        this.sortArr = sortedArray;
    }

    @Override
    public int[] sort() {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
        return sortArr;
    }
}
