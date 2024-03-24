public class Car {
    double variant, power[];
    int accel[];

    Car(int variant) {
        this.variant = variant;
        this.power = new double[variant];
        this.accel = new int[variant];
    }

    double mean(double arr[]) {
        double total = 0;
        for (int i = 0; i < this.variant; i++) {
            total += arr[i];
        }
        return total /= variant;
    }

    void accel(int arr[], int x, int y) {
        if (x < y) {
            int mid = partition(arr, x, y);
            accel(arr, x, mid - 1);
            accel(arr, mid + 1, y);
        }
    }

    void swap(int[] arr, int i, int j) {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }

    int partition(int[] arr, int x, int y) {
        int highest = arr[y];
        int i = x - 1;

        for (int j = x; j < y; j++) {
            if (arr[j] <= highest) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, y);
        return i + 1;
    }
}
