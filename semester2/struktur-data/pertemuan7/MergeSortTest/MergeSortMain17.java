public class MergeSortMain17 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 50, 30, 70, 20, 100, 90 };
        System.out.println("Sorting dengan merge sort");
        MergeSorting17 mSort = new MergeSorting17();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.sort(data, 0, data.length - 1);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
}
