package Basic.HomeWork3;

public class Bubl {
    public static void main(String[] args) {
        int[] arr = {8, 4, 15, 1, 7};
        bubl (arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void bubl (int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
