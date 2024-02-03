package LoopingDemo;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.printf("The Given %d is Even\n", i);

            } else {
                System.out.printf("The Given %d is Odd\n", i);

            }
            i++;

        }
    }
}
