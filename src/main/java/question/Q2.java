package question;

import model.Index;
import solver.ComparatorFactory;
import solver.Solver;
import solver.WarnsdorfHeuristicComparatorFactory;

import javax.lang.model.SourceVersion;
import java.util.List;

public class Q2 {

    public static void main(String[] args) {
        ComparatorFactory warnsdorHeuristic = new WarnsdorfHeuristicComparatorFactory();

        Solver solver = new Solver(new Index(20, 15));
        Index initial = new Index(0,0);

        List<Index> path = solver.getPath(initial, warnsdorHeuristic);

        System.out.println("count: " + Solver.count);

        for(int i = 0; i < path.size(); ++i) {
            System.out.println(i + " " + path.get(i));
        }


    }
}
