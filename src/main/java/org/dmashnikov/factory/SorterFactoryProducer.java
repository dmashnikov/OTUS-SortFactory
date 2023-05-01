package org.dmashnikov.factory;

public final class SorterFactoryProducer {

    public static AbstractSorterFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case ARRAY: return new ArraySorterFactory();
        }
        return null;
    }
}
