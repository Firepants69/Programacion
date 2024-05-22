import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            ConsoleBasedFizzBuzz fizz = new ConsoleBasedFizzBuzz();
            System.out.println("ingresa el maximo:");
            int max= Integer.parseInt(scan.nextLine());
            fizz.print(1, max);
        }
    
}
