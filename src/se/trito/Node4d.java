package se.trito;

import java.util.Objects;

public class Node4d extends Node3d{
    public int g;

    public Node4d(int x, int y, char c, int z, int g) {
        super(x, y, c, z);
        this.g = g;
    }

    public Node4d(int x, int y, int z, int g) {
        super(x, y, z);
        this.g = g;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Node4d node4d = (Node4d) o;
        return g == node4d.g;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), g);
    }
}
