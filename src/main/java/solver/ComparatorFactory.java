package solver;

import model.Index;

import java.util.Comparator;
import java.util.Set;

public interface ComparatorFactory {

    Comparator<Index> produce(Index dimension, Set<Index> visited);

}
