package SwitchDemo;

import java.util.Scanner;

public class AlphabetsExample {
    public static void main(String[] args) {
        
        System.out.println("Enter your favourite color");
        Scanner sc = new Scanner(System.in);
        String color = sc.next();
        switch (color) {
            case "B":
                System.out.println("You like Blak Color");
                break;
            case "R":
            System.out.println("You like REd Color");
                break;
            case "G":
            System.out.println("You like Green Color");
                break;
            default:
                System.out.println("You dont like Anything");
                break;   
                
        }

    }
}
