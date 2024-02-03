package LoopingDemo;

public class BreakContinueDemo {

    public static void main(String[] args) {
        int i;
        // for loop with break
        System.out.println("for loop with break");
        for (i = 1; i <= 20; i++) {

            if (i == 8) {
                break;

            }
            System.out.println(i);

        }
        System.out.println("While loop with continue");
        // while loop with continue

        for (i = 1; i <= 20; i++) {
            if (i == 5)
                continue;
            System.out.println(i);

        }

    }
}
