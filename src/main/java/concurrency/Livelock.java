package concurrency;

public class Livelock {
    public static void run() {
        PhoneCall buddy1 = new PhoneCall("Tomás");
        PhoneCall buddy2 = new PhoneCall("Guadalupe");
        HangUp hangUpAction = new HangUp(buddy1);

        new Thread(() -> buddy1.endCallWith(hangUpAction, buddy2)).start();
        new Thread(() -> buddy2.endCallWith(hangUpAction, buddy1)).start();
    }

    public static void main(String[] args) {
        run();
    }
}

class HangUp {
    private PhoneCall caller;

    public HangUp(PhoneCall d) {
        this.caller = d;
    }

    public void setCaller(PhoneCall d) {
        this.caller = d;
    }

    public PhoneCall getCaller() {
        return this.caller;
    }

    public void end() {
        System.out.println(this.caller.getName() + " has hang up!");
    }
}

class PhoneCall {
    private String name;
    private boolean isDone;

    public PhoneCall(String n) {
        this.name = n;
        this.isDone = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean isDone() {
        return this.isDone;
    }

    public void endCallWith(HangUp hangUp, PhoneCall buddy) {
        while (!this.isDone) {
            if (hangUp.getCaller() != this) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    continue;
                }
                continue;
            }
            // Solution: write here this.isDone = true;
            if (!buddy.isDone()) {
                System.out.println(this.name + ": No, you hang up, buddy " + buddy.getName());
                hangUp.setCaller(buddy);
                continue;
            }
            hangUp.end();
            this.isDone = true;// Solution: remove this line.
            buddy.isDone = true;
        }
    }
}
