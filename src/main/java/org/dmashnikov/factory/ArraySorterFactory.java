package org.dmashnikov.factory;

public class ArraySorterFactory implements AbstractSorterFactory {

    @Override
    public ArraySorter getSorterInstance(SorterType sortType, int[] sortArr) {
        switch (sortType) {
            case MERGE: return new MergeSorter(sortArr);
            case PASTE: return new PasteSorter(sortArr);
            case CHOICE: return new ChoiceSorter(sortArr);
            default:
                return null;
        }
    }
}
