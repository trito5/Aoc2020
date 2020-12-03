package se.trito;

import java.util.List;

public class Dec03a {

    public static void run(String fileName) {

        List<String> inputs = FileReaderUtil.toStringList(fileName);
        int counter = 0;
        int jPos = 1;
        int iPos = 0;

        for (int j = jPos; j < inputs.size(); j++) {
            if (iPos + 3 >= inputs.get(0).length()) {
                iPos = iPos + 3 - inputs.get(0).length();
            } else {
                iPos = iPos + 3;
            }
            if (inputs.get(j).charAt(iPos) == '#') {
                counter++;
            }
        }

        System.out.println("Dec03a: " + counter);
    }
}
