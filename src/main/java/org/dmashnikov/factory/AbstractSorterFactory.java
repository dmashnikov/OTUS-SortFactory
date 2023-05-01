package org.dmashnikov.factory;

public interface AbstractSorterFactory {

    ArraySorter getSorterInstance(SorterType sorterType, int[] sortArr);
}
