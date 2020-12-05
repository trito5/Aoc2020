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
        Dec04a.run("files/dec04.txt");
        Dec04b.run("files/dec04.txt");
        Dec05a.run("files/dec05.txt");
        Dec05b.run("files/dec05.txt");
    }
}
