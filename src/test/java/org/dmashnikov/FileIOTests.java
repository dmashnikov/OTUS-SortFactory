package org.dmashnikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class FileIOTests {

    @Test
    void checkReadFileToArr() throws IOException {
        String text = "3,1,2";
        FileWriter writer = new FileWriter("in.txt");
        writer.write(text);
        writer.close();


        int[] expectedArr = {3,1,2};
        Utils utils = new Utils();
        int[] actualArr = utils.readFileToArr("in.txt");
        Assertions.assertArrayEquals(expectedArr, actualArr);
    }

    @Test
    void checkWriteArrToFile() throws IOException {
        int[] expectedArr = {3,1,2};
        Utils utils = new Utils();
        utils.writeArrayToFile(expectedArr, "test.txt");
        File file = new File("test.txt");
        Assertions.assertTrue(file.exists());

        int[] actual = utils.readFileToArr(file.getAbsolutePath());
        Assertions.assertArrayEquals(expectedArr, actual);
    }
}
