import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type in factor n");
        int factor = scan.nextInt();

        int i, fact = 1;

        for (i = 1; i <= factor; i++ ){
        fact = fact*i;
        }
        System.out.println("Factorial number of " + factor + " is " + fact);
    }
}