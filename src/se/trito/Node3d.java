package se.trito;

import java.util.Objects;

public class Node3d extends Node {
    public int z;

    public Node3d(int x, int y, char c, int z) {
        super(x, y, c);
        this.z = z;
    }

    public Node3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public boolean isActive() {
        return c == '#';
    }

    @Override
    public String toString() {
        return "Node3d{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Node3d node3d = (Node3d) o;
        return z == node3d.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), z);
    }
}
