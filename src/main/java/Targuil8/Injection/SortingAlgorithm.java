package Targuil8.Injection;

public interface SortingAlgorithm <T extends Comparable<T>>{
    void sort(T[] array);
}
