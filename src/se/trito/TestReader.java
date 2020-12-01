package se.trito;

import java.util.Arrays;
import java.util.List;

public class TestReader {
    public static void run(String fileName) {
        List<Integer> inputInInts = FileReaderUtil.toIntList(fileName);
        List<String> inputInStrings = FileReaderUtil.toStringList(fileName);
        System.out.println(" ---- TEST CLASS ----");
        System.out.println("Text to ints: " + Arrays.toString(inputInInts.toArray()));
        System.out.println("Text to strings: " + Arrays.toString(inputInInts.toArray()));
    }
}
