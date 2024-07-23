// generic Swap method using array

class Swap {
    // Generic method to swap elements
    static <T> void swap(T[] x, T[] y) {
        T temp = x[0];
        x[0] = y[0];
        y[0] = temp;
    }

    public static void main(String[] args) {
        // Example with String
        String[] x = {"100"};
        String[] y = {"101"};
        System.out.println("Before swap x: " + x[0] + " y: " + y[0]);
        swap(x, y);
        System.out.println("After swap x: " + x[0] + " y: " + y[0]);

        // Example with Integer
        Integer[] a = {1};
        Integer[] b = {2};
        System.out.println("Before swap a: " + a[0] + " b: " + b[0]);
        swap(a, b);
        System.out.println("After swap a: " + a[0] + " b: " + b[0]);
    }
}
