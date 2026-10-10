package hw;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
