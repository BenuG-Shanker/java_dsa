// To print the provided pattern
// 1
// 1 2
// 1 2 3
// 1 2 3 4

public class halfPyramidPattern {
    public static void main(String[] args) {
        int n = 4;
        for(int line = 1; line <= n; line++) {
            for(int number = 1; number <= line; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}