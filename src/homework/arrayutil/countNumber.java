package homework.arrayutil;

public class countNumber {

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i]) {
                int tmp = array[i - 1];
                array[i - 1] = array[i];
                tmp = array[i];
            }
            System.out.println(array[i]);

        }

    }
}
