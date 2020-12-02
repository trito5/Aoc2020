package se.trito;

public class Node {

    public int x;
    public int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getManhattanDistance(Node externNode) {
        return Math.abs(externNode.x - this.x) + Math.abs(externNode.y - this.y);
    }

    public double getHypothenus(Node externNode) {
        int adjacent = Math.abs(externNode.x - this.x);
        int opposite = Math.abs(externNode.y - this.y);
        return Math.sqrt((adjacent*adjacent)+(opposite*opposite));
    }
}
