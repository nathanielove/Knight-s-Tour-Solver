package solver;

import model.Index;
import model.Utils;
import org.junit.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolverTest {

    @Test
    public void testComparator() throws Exception {

        Index dimension = new Index(6,6);
        Index current = new Index(1,2);
        Set<Index> visited = new HashSet<>();
        visited.add(current);

        Comparator<Index> comparator = new WarnsdorfHeuristicComparator(dimension, visited);

        List<Index> validNeighbors = Utils.validNeighbors(current, visited, dimension);

        System.out.println(validNeighbors);

        validNeighbors.sort(comparator);

        System.out.println(validNeighbors);

        System.out.println(Utils.validNeighbors(new Index(0, 0), visited, dimension));
        System.out.println(Utils.validNeighbors(new Index(0, 4), visited, dimension));


    }
}