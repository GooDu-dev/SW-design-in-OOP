import java.util.Collection;
import java.util.List;

public class Ex02OpenClosed {
    public static void main(String[] args) {

        // create sorter obj
        Sorting sorter;

        // set sorter obj to SelectionSort instance
        sorter = new SelectionSort();
        sorter.sort(null);

        // set sorter obj to MergeSort instance
        sorter = new MergeSort();
        sorter.sort(null);

        // set sorter obj to InsertionSort instance
        sorter = new InsertionSort();
        sorter.sort(null);
    }
}

class SelectionSort implements Sorting {
    @Override
    public <T> List<T> sort(Collection<T> collection) {
        // TODO Auto-generated method stub
        System.out.println("Selection sort is sorting the items...");
        return null;
    }
}

class MergeSort implements Sorting {
    @Override
    public <T> List<T> sort(Collection<T> collection) {
        // TODO Auto-generated method stub
        System.out.println("Merge sort is sorting the items...");
        return null;
    }
}

class InsertionSort implements Sorting {
    @Override
    public <T> List<T> sort(Collection<T> collection) {
        // TODO Auto-generated method stub
        System.out.println("Insertion sort is sorting the items...");
        return null;
    }
}

interface Sorting {
    public <T> List<T> sort(Collection<T> collection);
}