import java.util.Scanner;

class Main {

    static boolean running = false;
    static long startTime;
    static long elapsedTime = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STOPWATCH =====");
            System.out.println("1. Start");
            System.out.println("2. Reset");
            System.out.println("3. Exit");

            System.out.print("Choose: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:

                    if (running) {
                        System.out.println("Stopwatch is already running!");
                        break;
                    }

                    running = true;

                    startTime = System.currentTimeMillis() - elapsedTime;

                    System.out.println("\nStopwatch started!");
                    System.out.println("Press ENTER to stop.");

                    Thread timerThread = new Thread(() -> {

                        while (running) {

                            elapsedTime =
                                    System.currentTimeMillis() - startTime;

                            long totalSeconds = elapsedTime / 1000;

                            long hours = totalSeconds / 3600;
                            long minutes = (totalSeconds % 3600) / 60;
                            long seconds = totalSeconds % 60;

                            System.out.printf(
                                    "\r%02d:%02d:%02d",
                                    hours,
                                    minutes,
                                    seconds
                            );

                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                break;
                            }
                        }
                    });

                    timerThread.start();

                    scan.nextLine();

                    running = false;

                    try {
                        timerThread.join();
                    } catch (InterruptedException e) {
                        System.out.println("\nTimer interrupted!");
                    }

                    System.out.println("\nStopwatch stopped.");

                    break;

                case 2:

                    if (running) {
                        System.out.println("Stop the stopwatch before resetting!");
                    } else {
                        elapsedTime = 0;
                        System.out.println("Stopwatch reset.");
                    }

                    break;

                case 3:

                    System.out.println("Goodbye!");
                    scan.close();
                    return;

                default:

                    System.out.println("Choose 1, 2, or 3.");
            }
        }
    }
}