package org.dmashnikov;

import org.dmashnikov.factory.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Utils utils = new Utils();
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите вид сортировки: Выбором [1], вставки [2], слиянием [3]");
        int sortType = in.nextInt();
        System.out.println("Введите путь до файла со входными данными:");
        String path = in.next();
        System.out.println("Введите имя файла с выходными данными:");
        String oufFileName = in.next();
        int[] sortArr = utils.readFileToArr(path);
        AbstractSorterFactory sorterFactory = SorterFactoryProducer.getFactory(FactoryType.ARRAY);
        ArraySorter sorter = sorterFactory.getSorterInstance(new SortTypeMapper(sortType).map(), sortArr);
        int[] sort = sorter.sort();
        utils.writeArrayToFile(sort, oufFileName);
        System.out.println("Выбранный файл успешно отсортирован");
    }
}