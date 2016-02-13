package model;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void testValidNeighbors() throws Exception {
        Index dimension = new Index(5, 8);
        Index current = new Index(0, 4);
        Set<Index> visited = new HashSet<>();

        System.out.println(Utils.validNeighbors(current, visited, dimension));

    }
}