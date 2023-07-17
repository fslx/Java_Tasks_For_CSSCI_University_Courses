public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(6)); // expected output : 8
    }


private static long fib(int n) {
    if(n <= 1) {
        return n;
    }
    return (fib(n - 1) + fib(n - 2));
}}


