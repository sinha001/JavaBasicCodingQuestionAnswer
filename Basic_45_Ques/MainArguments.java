//WAP to illustrate the passing of the command line argument and then using the argument in the program.
// The Program will display "Hi, Neeraj. Welcome to java" where Neeraj is passed as the command line arguments.

public class MainArguments {

    public static void main(String[] args) {

        System.out.print("Hi");
        System.out.print(args[0]);
        System.out.println(". Welcome to Java");

    }

}
