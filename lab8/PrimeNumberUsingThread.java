package lab8;

public class PrimeNumberUsingThread extends Thread{
    int start;
    int end;
    int counter;

    PrimeNumberUsingThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void printPrimeNumbers(int start, int end) {
        for(int i=start; i<=end; i++) {
            if(isPrime(i)) {
                System.out.println("Found and printed by: "+Thread.currentThread().getName() +" -> " +i);
                counter++;
            }
        }
    }

    public static boolean isPrime(int num) {
        if(num<=1) return false;
        if(num==2) return true;
        if(num%2==0) return false;

        for(int i=3; i*i<=num; i+=2) {
            if(num%i==0) return false;
        }

        return true;
    }

    @Override
    public void run(){
        try {
            printPrimeNumbers(start, end);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        PrimeNumberUsingThread p1 = new PrimeNumberUsingThread(1,50);
        PrimeNumberUsingThread p2 = new PrimeNumberUsingThread(51, 100);

        System.out.println("===================");
        p1.start();
        p2.start();
        
        
        try {
            p1.join();
            p2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total count of prime number : "+(p1.counter+p2.counter));
    }
}
