package org.dmashnikov.factory;

public class SortTypeMapper {
    private int sortType;

    public SortTypeMapper(int sortType) {
        this.sortType = sortType;
    }

    public SorterType map() {
        switch (sortType) {
            case 1: return SorterType.CHOICE;
            case 2: return SorterType.PASTE;
            case 3: return SorterType.MERGE;
        }
        return null;
    }
}
