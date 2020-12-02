package se.trito;

import java.util.Arrays;
import java.util.List;

public class TestReader {
    private static final String TEST_FILE_1 = "files/test1.txt";
    private static final String TEST_FILE_2 = "files/test2.txt";
    public static void run() {
        List<Integer> inputInInts = FileReaderUtil.toIntList(TEST_FILE_1);
        List<String> inputInStrings = FileReaderUtil.toStringList(TEST_FILE_1);
        List<String> inputsInStringsSplitted = FileReaderUtil.splitOnRegexToStringList(TEST_FILE_2, "\\s*,\\s*");
        List<Integer> inputsInIntsSplitted = FileReaderUtil.splitOnRegexToIntList(TEST_FILE_2, "\\s*,\\s*");
        System.out.println(" ---- TEST READER ----");
        System.out.println("Text to ints: " + Arrays.toString(inputInInts.toArray()));
        System.out.println("Text to strings: " + Arrays.toString(inputInStrings.toArray()));
        System.out.println("Text to Strings, splitted on ,: " + Arrays.toString(inputsInStringsSplitted.toArray()));
        System.out.println("Text to ints, splitted on ,: " + Arrays.toString(inputsInIntsSplitted.toArray()));
    }
}
