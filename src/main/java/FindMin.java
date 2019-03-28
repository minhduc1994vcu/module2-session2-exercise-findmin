
public class FindMin {
    public static void main(String[] args) {
        int[] array = {9, 34, 2, 1, 54, 3, 2};
        int index = findMin(array);
        System.out.printf("the min is %d at position %d", array[index], index);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;

    }
}
