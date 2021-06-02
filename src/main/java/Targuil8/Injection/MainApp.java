package Targuil8.Injection;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.Produces;

// TODO: Add java classes (in separate files for annotations and aspects)
public class MainApp {
    public static WeldContainer container = new Weld().initialize();

    public static void main(String[] args) {
        // TODO: Change this line to initialize an injected AlgorithmRunner
        AlgorithmRunner algorithmRunner = container.select(AlgorithmRunner.class).get();
        algorithmRunner.runAlgorithms();
    }
    @Produces
    public @FirstClass
    SortingAlgorithm setquadraticAlgorithm(){
        return container.select(BubbleSort.class).get();
    }
    @Produces
    public @SecondClass SortingAlgorithm setnlognAlgorithm(){
        return container.select(QuickSort.class).get();
    }
    @Produces
    public @FirstClass
    int setnumberOfElements(){
        return 10000;
    }
}
