package se.trito;

import java.util.List;

public class Dec01a {
    public static void run(String fileName) {
        System.out.println(" ---- DEC01A ---- ");
        List<Integer> inputs = FileReaderUtil.toIntList(fileName);

        for (int i = 0; i < inputs.size(); i++) {
            for (int j = i; j < inputs.size(); j++) {
                if (inputs.get(i) + inputs.get(j) == 2020) {
                    System.out.println(inputs.get(i) * inputs.get(j));
                }
            }
        }
    }
}
