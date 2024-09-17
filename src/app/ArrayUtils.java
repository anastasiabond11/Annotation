package app;

public class ArrayUtils {

    @MethodInfo(name = "findMax", returnType = "int", description = "Find MAX value")
    @Author(firstName = "Vlad", lastName = "Jurchenko")
    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @MethodInfo(name = "findMin", returnType = "int", description = "Find MIN value")
    @Author(firstName = "Ladislav", lastName = "Kochkovich")
    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}