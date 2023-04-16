package org.dmashnikov;

import org.dmashnikov.factory.ChoiseSortFactory;
import org.dmashnikov.factory.MergeSortFactory;
import org.dmashnikov.factory.PasteSortFactory;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySorter {

    public int[] readFileToArr(String filePath) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader(filePath))
                .useDelimiter(",");
        while (sc.hasNext()) {
            list.add(Integer.valueOf(sc.next()));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public void writeArrayToFile(int[] sortedArr, String outFileName) throws IOException {
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
        FileWriter writer = new FileWriter(path + "/" + outFileName);
        int len = sortedArr.length;
        for (int i = 0; i < len; i++) {
            writer.write(sortedArr[i] + ",");
        }
        writer.close();
    }

    public int[] sortByType(int type, int[] arr) throws FileNotFoundException {
        int[] sortedArr = new int[0];
        switch (type) {
            case 1:
                sortedArr = new ChoiseSortFactory().sort(arr);
                break;
            case 2:
                sortedArr = new PasteSortFactory().sort(arr);
                break;
            case 3:
                sortedArr = new MergeSortFactory().sort(arr);
                break;
            default:
                System.out.println("Не выбран тип сортировки");
                break;
        }
        return sortedArr;
    }
}
