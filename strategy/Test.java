package strategy;

public class Test {
    public static void main(String[] args) {
        // Create SortingContext with BubbleSortStrategy
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext.performSort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(" "+array1[i]);
        }
        System.out.println();
        // Change strategy to MergeSortStrategy
        sortingContext.setSortingStrategy(new MergeSortStrategy());
        int[] array2 = {8, 3, 7, 4, 2};
        sortingContext.performSort(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(" "+array2[i]);
        } 
        System.out.println();
        // Change strategy to QuickSortStrategy
        sortingContext.setSortingStrategy(new QuickSortStrategy());
        int[] array3 = {6, 1, 3, 9, 5};
        sortingContext.performSort(array3);
        for (int i = 0; i < array3.length; i++) {
            System.out.print(" "+array3[i]);
        } 
    }
}
