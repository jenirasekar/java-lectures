public class Main {
    public static void main(String[] args) {
        int count = 0; // count how many primes we've found
        int number = 2; // start checking from 2
        final int NUM_PRIMES = 50; // total primes to find
        final int PRIMES_PER_LINE = 10; // primes per row

        while (count < NUM_PRIMES) {
            if (isPrime(number)) { // check if number is prime
                System.out.printf("%5d", number); // print with spacing
                count++;

                if (count % PRIMES_PER_LINE == 0) { // new line after 10 numbers
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false; // 1 is not prime
        for (int i = 2; i * i <= num; i++) { // Check up to sqrt(num)
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }
}
