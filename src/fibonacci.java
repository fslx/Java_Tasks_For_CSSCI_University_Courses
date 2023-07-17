public class fibonacci {
    private static long []fibTimeComplexityOptimized;
    public static void main(String[] args) {
        int n = 50; // max limit = 92 as 92++ will reach max long at : 9,223,372,036,854,775,807
        fibTimeComplexityOptimized = new long[n + 1];
        for(int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " "); // expected output : 0 1 1 2 3 5 8 13 21 34 ...
        }
    }


private static long fib(int n) {
    if(n <= 1) {
        return n;
    }

    if(fibTimeComplexityOptimized[n] != 0) {
        return fibTimeComplexityOptimized[n];
    }

    long nth = (fib(n - 1) + fib(n - 2));
    fibTimeComplexityOptimized[n] = nth;

    return nth;
}}
