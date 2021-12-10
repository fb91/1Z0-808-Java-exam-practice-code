package concurrency;

public class Line {
    synchronized public void getLine() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(400);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Train extends Thread {
    Line line;

    Train(Line line) {
        this.line = line;
    }

    @Override
    public void run() {
        line.getLine();
    }
}

class GFG {
    public static void main(String[] args) {
        Line obj = new Line();

        // creating the threads that are
        // sharing the same Object.
        Train train1 = new Train(obj);
        Train train2 = new Train(obj);

        // threads start their execution.
        train1.start();
        train2.start();
    }
}
