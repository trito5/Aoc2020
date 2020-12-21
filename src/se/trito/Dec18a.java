package se.trito;

import java.util.*;

public class Dec18a {
    public static void run(String fileName) {
        List<String> inputs = FileReaderUtil.toStringList(fileName);
        long totValue = 0L;
        for (String line : inputs) {
            int level = 0;
            line = line.replaceAll(" ", "");
            Stack<Long> levelSums = new Stack<>();
            levelSums.add(0L);
            Stack<Character> operators = new Stack<>();
            operators.add('+');
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '(') {
                    level++;
                    operators.push('+');
                } else if (c == ')') {
                    level--;
                    long subLevelvalue = levelSums.pop();
                    long existingSum = levelSums.pop();
                    levelSums.push(getNewValue(existingSum, operators.pop(), subLevelvalue));
                } else if (c == '+') {
                    operators.add('+');
                } else if (c == '*') {
                    operators.add('*');
                } else {
                    while (level > levelSums.size() - 1) {
                        if (operators.peek() == '*') {
                            levelSums.add(1L);
                        } else {
                            levelSums.add(0L);
                        }
                    }
                    long sum = getNewValue(levelSums.get(level), operators.pop(), Integer.parseInt(String.valueOf(c)));
                    levelSums.set(level, sum);
                }
            }
            totValue += levelSums.pop();
        }
        System.out.println("Dec18a: " + totValue); //1402255785165
    }
    private static long getNewValue(long sum, char c, long i) {
        if (c == '+') {
            return sum + i;
        } else {
            return sum * i;
        }
    }
}
