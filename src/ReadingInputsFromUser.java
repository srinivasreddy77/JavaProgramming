import java.util.Scanner;

public class ReadingInputsFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name:");
        String name = scanner.nextLine();//handles next line character(enter key)
        //the input which we are passing from user should come after entering first input and after that second input
        //should come after that second method call
        System.out.println("enter the age:");
        int age = scanner.nextInt();


        if (age > 0 && age < 100) {
            System.out.println("your name is " + name + " and your age is " + age);
        } else {
            System.out.println("invalid age");
        }
        scanner.close();

    }
}



