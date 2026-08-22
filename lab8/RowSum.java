package lab8;

public class RowSum implements Runnable{

    int start;
    int sum;

    RowSum(int start) {
        this.start = start;
    }

    int[][] arr = {{10, 20, 30, 40},{5, 15, 25, 35},{2, 4, 6, 8},{100, 200, 300, 4}};

    public void printSum(int start){
        for(int i= 0; i<arr[0].length; i++){
            sum += arr[start][i];
        }
        System.out.println("Row "+start+ "sum printed by: "+Thread.currentThread().getName() +" -> " +sum);
    }


    @Override
    public void run() {
        try {
            printSum(start);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        RowSum r1 = new RowSum(0);
        RowSum r2 = new RowSum(1);
        RowSum r3 = new RowSum(2);
        RowSum r4 = new RowSum(3);


        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t4 = new Thread(r3);
        Thread t3 = new Thread(r4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total Sum: "+(r1.sum+r2.sum+r3.sum+r4.sum));
    }
    
}
