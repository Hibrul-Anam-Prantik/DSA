public class MultiplicationTable {
    public static void main(String[] args) {
        int[] numbers = new int[] { 100, 20, 300, 40, 50 };
        callTable(numbers, 0);
    }

    public static void callTable(int[] arr, int i) {
        if (i == arr.length - 1)
            return;

        makeTable(arr[i]);
        callTable(arr, i + 1);
    }

    public static void makeTable(int n) {
        System.out.println("=================");
        for (int i = 1; i < 11; ++i)
            System.out.println(n + " x " + i + " = " + (n * i));
    }
}
