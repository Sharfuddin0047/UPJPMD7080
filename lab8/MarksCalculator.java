package lab8;

public class MarksCalculator implements Runnable {

    int start;
    int[][] marks;
    int sum;

    public MarksCalculator(int start, int[][] marks) {
        this.start = start;
        this.marks = marks;
    }

    public void printSum(int start) {
        for (int i = 0; i < marks[0].length; i++) {
            sum += marks[start][i];
        }
        System.out.println("Student " + (start + 1) + " sum printed by: " + Thread.currentThread().getName() + " -> "
                + sum + " | average = " + (float) sum / marks[start].length);
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
        int[][] marks = { { 85, 90, 78, 88 }, { 70, 65, 80, 75 }, { 95, 92, 96, 94 }, { 60, 72, 68, 70 } };
        MarksCalculator m1 = new MarksCalculator(0, marks);
        MarksCalculator m2 = new MarksCalculator(1, marks);
        MarksCalculator m3 = new MarksCalculator(2, marks);
        MarksCalculator m4 = new MarksCalculator(3, marks);

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        Thread t4 = new Thread(m4);

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

        int classTotal = m1.sum + m2.sum + m3.sum + m4.sum;
        float classAverage = (float) classTotal / (marks.length * marks[0].length);

        System.out.println("Class Total: " + classTotal);
        System.out.println("Class Average: " + classAverage);

    }
}
