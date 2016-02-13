package solver;

import model.Index;

import java.util.Comparator;
import java.util.Set;

public class BruteForceComparatorFactory implements ComparatorFactory{
    @Override
    public Comparator<Index> produce(Index dimension, Set<Index> visited) {
        return new BruteForceComparator();
    }
}
