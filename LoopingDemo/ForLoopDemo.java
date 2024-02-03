package LoopingDemo;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.printf("The Number %d is even\n", i);

            } else {
                System.out.printf("The Number %d is odd\n", i);
            }
        }

    }
}
