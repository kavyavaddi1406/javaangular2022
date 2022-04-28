


public class arr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 9, -6, - 1, 4, 5};

        int multiply = 1;
        for (int i : arr) {
            multiply *= i;
        }
        System.out.println("multiply = " + multiply);
    }
}
