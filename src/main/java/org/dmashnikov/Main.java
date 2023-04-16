package org.dmashnikov;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ArraySorter arraySorter = new ArraySorter();
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите вид сортировки: Выбором [1], вставки [2], слиянием [3]");
        int sortType = in.nextInt();
        System.out.println("Введите путь до файла со входными данными:");
        String path = in.next();
        System.out.println("Введите имя файла с выходными данными:");
        String oufFileName = in.next();
        int[] sortArr = arraySorter.readFileToArr(path);
        int[] sorted = arraySorter.sortByType(sortType, sortArr);
        arraySorter.writeArrayToFile(sorted, oufFileName);
        System.out.println("Выбранный файл успешно отсортирован");
    }
}