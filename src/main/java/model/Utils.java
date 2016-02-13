package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Utils {

    private Utils(){

    }

    public static boolean inRange(Index dimension, Index index){
        return Index.insideOf(index, dimension) && Index.outsideOfOrEqualTo(index, Index.ORIGIN);
    }

    public static List<Index> validNeighbors(Index current, Set<Index> visited, Index dimension){
        List<Index> neighbors = new ArrayList<>();
        for(Index neighbor : current.next()){
            if((!visited.contains(neighbor)) && (inRange(dimension, neighbor))){
                neighbors.add(neighbor);
            }
        }

        return neighbors;
    }
}
