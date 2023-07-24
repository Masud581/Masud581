class FibonacciThread extends Thread {
    private int n;

    public FibonacciThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int first = 0;
        int second = 1;
        int next;

        System.out.println("Fibonacci Series (" + n + " terms):");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            next = first + second;
            first = second;
            second = next;

            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrimeThread extends Thread {
    private int start;
    private int end;

    public PrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("Prime Numbers in the range " + start + " to " + end + ":");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

public class Multhreading {
    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread(10);
        PrimeThread primeThread = new PrimeThread(1, 30);

        fibonacciThread.start();
        primeThread.start();
    }
}
