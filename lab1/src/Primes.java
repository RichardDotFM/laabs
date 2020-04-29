public class Primes {

    public static void main(String[] args) {
        for (int j = 2; j <= 103; j++) {
            if (isPrime(j)) System.out.println(j);
        }
    }
    /**
     * проверка числа n на простое число
     * n вводится отдельно
     */
    public static boolean isPrime(int n) {
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) return false;
        }
        return true;
    }
}