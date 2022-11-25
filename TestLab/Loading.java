package Java.TestLab;

public class Loading {
    Thread t;

    public static void main(String[] args) {
        Loading pc = new Loading();
        pc.process();
    }

    public void process() {
        t = new Thread() {
            public void run() {
                System.out.print("Procecessing.........");
                for (int i = 0; i <= 100; i++)
                    try {
                        {
                            if (i < 10) {
                                System.out.print(i + "%");
                                System.out.print("\b\b");
                            } else if (i >= 10 && i <= 99) {
                                System.out.print(i + "%");
                                System.out.print("\b\b\b");
                            }
                            if (i == 100) {
                                System.out.print(i + "%");
                            }
                            t.sleep(20);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        };
        t.start();
    }

}
