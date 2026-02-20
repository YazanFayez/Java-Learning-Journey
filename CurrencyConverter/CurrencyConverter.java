import java.util.*;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n--- Currency Converter Menu ---");
            System.out.println("1. USD -> AED");
            System.out.println("2. AED -> USD");
            System.out.println("3. USD -> EUR");
            System.out.println("4. EUR -> USD");
            System.out.println("5. AED -> INR");
            System.out.println("6. INR -> AED");
            System.out.println("7. USD -> GBP");
            System.out.println("8. GBP -> USD");
            System.out.println("9. Exit\n");
            System.out.print("Enter your choice: ");
            
            choice = console.nextInt();

            if (choice == 9) {
                break;
            }
            else if (choice <= 0 || choice > 9) {
                System.out.println("ENTER A VALID RANGE!!");
                continue; 
            }
            else {
                System.out.print("Enter amount: ");
                double amount = console.nextDouble();
                double result = 0;

                switch (choice) {
                    case 1:
                        result = amount * 3.67;
                        System.out.printf("%.2f USD = %.2f AED\n", amount, result);
                        break;
                    case 2:
                        result = amount * 0.27;
                        System.out.printf("%.2f AED = %.2f USD\n", amount, result);
                        break;
                    case 3:
                        result = amount * 0.93;
                        System.out.printf("%.2f USD = %.2f EUR\n", amount, result);
                        break;
                    case 4:
                        result = amount * 1.08;
                        System.out.printf("%.2f EUR = %.2f USD\n", amount, result);
                        break;
                    case 5:
                        result = amount * 22.6;
                        System.out.printf("%.2f AED = %.2f INR\n", amount, result);
                        break;
                    case 6:
                        result = amount * 0.044;
                        System.out.printf("%.2f INR = %.2f AED\n", amount, result);
                        break;
                    case 7:
                        result = amount * 0.79;
                        System.out.printf("%.2f USD = %.2f GBP\n", amount, result);
                        break;
                    case 8:
                        result = amount * 1.26;
                        System.out.printf("%.2f GBP = %.2f USD\n", amount, result);
                        break;
                }
            }
        } while (choice != 9);

        System.out.println("Thanks for using the Currency Converter!");
        console.close();
    }
}
