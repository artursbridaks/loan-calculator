import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select loan type (1 for Housing, 2 for Car): ");
        int loanTypeChoice = scanner.nextInt();

        LoanType loanType;
        if (loanTypeChoice == 1) {
            loanType = new HousingLoan();
        } else if (loanTypeChoice == 2) {
            loanType = new CarLoan();
        } else {
            System.out.println("Invalid choice. Exiting...");
            scanner.close();
            return;
        }

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter payback time in months: ");
        int paybackTimeMonths = scanner.nextInt();

        LoanCalculationService loanCalculationService = new LoanCalculationService(loanType);
        loanCalculationService.calculateLoanDetails(loanAmount, paybackTimeMonths);

        scanner.close();
    }
}