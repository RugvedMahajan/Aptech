package IfElseDemo;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int marks;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Your Marks");
        marks=scanner.nextInt();
        if (
            marks>70
        ) {
                System.out.println("Grade O");

        } else if (marks <70&&marks>60) {
            System.out.println("Grade A");

            
        }
        else if (marks<60&&marks>50) {
            System.out.println("Grade B");

            
        }
        else if (marks<50&&marks>40) {
            System.out.println("Grade C");


            
        }
        else 
        {
            System.out.println("Grade F");   
        }
        
    }
}
