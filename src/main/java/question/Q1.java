package question;

import model.Index;
import solver.BruteForceComparatorFactory;
import solver.ComparatorFactory;
import solver.Solver;

import java.util.List;

public class Q1 {

    public static void main(String[] args) {
        ComparatorFactory bruteForce = new BruteForceComparatorFactory();

        Solver solver = new Solver(new Index(6, 6));
        Index initial = new Index(2, 3);

        List<Index> path = solver.getPath(initial, bruteForce);

        for(int i = 0; i < path.size(); ++i) {
            System.out.println(i + " " + path.get(i));
        }
    }
}
