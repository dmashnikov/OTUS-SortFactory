package org.dmashnikov;

import org.dmashnikov.factory.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class SortedTests {

    @Test
    void checkChoiceSort() throws FileNotFoundException {
        int sortType = 1;
        int[] inArr = {3,1,2};
        int[] expectedArr = {1,2,3};
        AbstractSorterFactory sorterFactory = SorterFactoryProducer.getFactory(FactoryType.ARRAY);
        ArraySorter sorter = sorterFactory.getSorterInstance(new SortTypeMapper(sortType).map(), inArr);
        int[] sort = sorter.sort();
        Assertions.assertArrayEquals(expectedArr, sort);
    }

    @Test
    void checkPasteSort() throws FileNotFoundException {
        int sortType = 2;
        int[] inArr = {3,1,2};
        int[] expectedArr = {1,2,3};
        Utils utils = new Utils();
        AbstractSorterFactory sorterFactory = SorterFactoryProducer.getFactory(FactoryType.ARRAY);
        ArraySorter sorter = sorterFactory.getSorterInstance(new SortTypeMapper(sortType).map(), inArr);
        int[] sort = sorter.sort();
        Assertions.assertArrayEquals(expectedArr, sort);
    }

    @Test
    void checkMergeSort() throws FileNotFoundException {
        int sortType = 3;
        int[] inArr = {3,1,2};
        int[] expectedArr = {1,2,3};
        Utils utils = new Utils();
        AbstractSorterFactory sorterFactory = SorterFactoryProducer.getFactory(FactoryType.ARRAY);
        ArraySorter sorter = sorterFactory.getSorterInstance(new SortTypeMapper(sortType).map(), inArr);
        int[] sort = sorter.sort();
        Assertions.assertArrayEquals(expectedArr, sort);
    }

}
