package solver;

import model.Index;
import model.Utils;

import java.util.*;

public class Solver {

    public static int count = 0;

    private Index dimension;

    public Solver(Index dimension) {
        this.dimension = dimension;
    }

    public static boolean getPathRecursive(Index current, Set<Index> visited, Index dimension, Map<Index, Index> next, ComparatorFactory comparatorFactory){

        ++count;

        visited.add(current);

        if(visited.size() == dimension.getX() * dimension.getY()){
            return true;
        }

        List<Index> neighbors = Utils.validNeighbors(current, visited, dimension);
        Comparator<Index> comparator = comparatorFactory.produce(dimension, visited);
        neighbors.sort(comparator);

        for(Index neighbor : neighbors){

            if(getPathRecursive(neighbor, new HashSet<>(visited), dimension, next, comparatorFactory)){
                next.put(current, neighbor);
                return true;
            }
        }

        return false;

    }

    public List<Index> getPath(Index initial, ComparatorFactory comparatorFactory){
        Set<Index> visited = new HashSet<>();
        List<Index> path = new ArrayList<>();
        Map<Index, Index> next = new HashMap<>();

        count = 0;

        boolean result = getPathRecursive(initial, visited, this.dimension, next, comparatorFactory);

        if(result){
            Index current = initial;
            path.add(current);
            int total = this.dimension.getX() * this.dimension.getY();

            while(path.size() < total){
                Index neighbor = next.get(current);
                path.add(neighbor);
                current = neighbor;
            }
        }

        return path;
    }
}
