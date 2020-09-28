public class InsertionSort {
    static int[] list = {5, 11, 9, -4, 6, 2, -1, 4};
    public static void insertionSort(int[] list) {
        for(int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k+ 1] = list[k];
            }
            list[k +1] = currentElement;

        }

    }

    public static void main(String[] args) {
        System.out.println("Trc khi sap xep");
        for(int j = 0; j < list.length; j++) {
            System.out.print(list[j] + ",");
        }
        insertionSort(list);
        for(int i = 0 ; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println();
    }
}
