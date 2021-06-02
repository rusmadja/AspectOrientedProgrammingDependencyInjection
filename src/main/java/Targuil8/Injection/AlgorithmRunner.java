package Targuil8.Injection;

import java.util.Random;

// TODO: Add dependency injection and annotations to this file
public class AlgorithmRunner {
    SortingAlgorithm<Integer> quadraticAlgorithm ;
    SortingAlgorithm<Integer> nlognAlgorithm ;
    int numberOfElements;
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
