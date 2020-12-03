package se.trito;

public class Main {

    public static void main(String[] args) {
        TestReader.run();
        TestClasses.run();

        System.out.println("-----------------------------");

        Dec01a.run("files/dec01.txt");
        Dec01b.run("files/dec01.txt");
        Dec02a.run("files/dec02.txt");
        Dec02b.run("files/dec02.txt");
        Dec03a.run("files/dec03.txt");
        Dec03b.run("files/dec03.txt");
    }
}
