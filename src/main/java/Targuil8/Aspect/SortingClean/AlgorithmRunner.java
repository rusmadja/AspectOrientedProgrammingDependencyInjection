package Targuil8.Aspect.SortingClean;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Random;

// TODO: Add dependency injection and annotations to this file
public class AlgorithmRunner {

    SortingAlgorithm<Integer> quadraticAlgorithm;
    SortingAlgorithm<Integer> nlognAlgorithm ;
    int numberOfElements;
    @Inject
    private @Named("FirstClass") SortingAlgorithm quadratic;
     @Inject
    private @Named("SecondClass") SortingAlgorithm nlogn;
     @Inject
    private @Named("HighClass") int elements;

    public void runAlgorithms(){
        Random rand = new Random();
        Integer[] ints = rand.ints(1,Integer.MAX_VALUE)
                .distinct()
                .limit(numberOfElements)
                .boxed()
                .toArray(Integer[]::new);
        Integer[] intsClone = ints.clone();
        quadraticAlgorithm.sort(intsClone);
        intsClone = ints.clone();
        nlognAlgorithm.sort(intsClone);
    }
}
