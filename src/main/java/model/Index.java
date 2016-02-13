package model;

import java.util.HashSet;
import java.util.Set;

public class Index {

    public static final Index ORIGIN = new Index(0, 0);

    private int x;
    private int y;

    public Index(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Index add(Index index){
        return new Index(this.x + index.x, this.y + index.y);
    }

    public Set<Index> next(){
        Index[] indices = new Index[]{
                new Index(1, 2),
                new Index(1, -2),
                new Index(-1, 2),
                new Index(-1, -2),
                new Index(2, 1),
                new Index(2, -1),
                new Index(-2, 1),
                new Index(-2, -1)
        };

        Set<Index> nexts = new HashSet<>();
        for(Index index : indices){
            nexts.add(this.add(index));
        }

        return nexts;
    }

    public static boolean insideOf(Index a, Index b){
        return a.x < b.x && a.y < b.y;
    }

    public static boolean insideOfOrEqualTo(Index a, Index b){
        return a.x <= b.x && a.y <= b.y;
    }

    public static boolean outsideOf(Index a, Index b){
        return a.x > b.x && a.y > b.y;
    }

    public static boolean outsideOfOrEqualTo(Index a, Index b){
        return a.x >= b.x && a.y >= b.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Index index = (Index) o;

        return x == index.x && y == index.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("x", x)
                .add("y", y)
                .toString();
    }
}
