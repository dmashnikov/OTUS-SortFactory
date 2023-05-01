package org.dmashnikov;

import org.dmashnikov.factory.ChoiceSorter;
import org.dmashnikov.factory.MergeSorter;
import org.dmashnikov.factory.PasteSorter;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

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
}
