package solver;

import model.Index;
import model.Utils;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class WarnsdorfHeuristicComparator implements Comparator<Index> {

    private Index dimension;
    private Set<Index> visited;

    public WarnsdorfHeuristicComparator(Index dimension, Set<Index> visited) {
        this.dimension = dimension;
        this.visited = visited;
    }

    @Override
    public int compare(Index a, Index b) {
        List<Index> aNeighbors = Utils.validNeighbors(a, visited, dimension);
        List<Index> bNeighbors = Utils.validNeighbors(b, visited, dimension);
        return Integer.compare(aNeighbors.size(), bNeighbors.size());
    }
}
