import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import java.util.Scanner;


public class Test{
    public static void main(String[] args) {
        System.out.println("Pls enter a number from 1 to 7 ");
        Scanner scanner= new Scanner(System.in);
        int imto = scanner.nextInt();
        if (imto > 7 || imto <= 0){
            System.out.println("Are you stupid? It says to enter from 1 to 7!!!!!");

        }
        else if (imto == 1) {
            System.out.println("Today is Monday.");

        }
        else if (imto == 2) {
            System.out.println("Today is Tuesday.");
        }
        else if (imto == 3) {
            System.out.println("Today is Wednesday.");

        }
        else if (imto == 4) {
            System.out.println("Today is Thursday.");

        }
        else if (imto == 5) {
            System.out.println("Today is Friday.");

        }
        else if (imto == 6) {
            System.out.println("Today is Saturday.");

        }
        else if (imto == 7) {
            System.out.println("Today is Sunday.");

        }


    }
}
