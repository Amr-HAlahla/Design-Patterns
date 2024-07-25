package strategy.sorting;

public class Client {
    public static void main(String[] args) {
        int[] list = {5, 2, 3, 9, 4, 1, 7};
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        sortingContext.performSorting(list);

        //Change the strategy
        sortingContext.setSortingStrategy(new MergeSortStrategy());
        sortingContext.performSorting(list);

        // QuickSort Strategy
        sortingContext.setSortingStrategy(new QuickSortStrategy());
        sortingContext.performSorting(list);
    }
}
