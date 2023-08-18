import java.text.DecimalFormat;

public class LoanCalculationService {
    private final LoanType loanType;

    public LoanCalculationService(LoanType loanType) {
        this.loanType = loanType;
    }

    public void calculateLoanDetails(double loanAmount, int paybackTimeMonths) {

        // Amortizing loan formula
        // M = P * (r * (1 + r)^n) / ((1 + r)^n - 1)

        // M = monthlyPayment
        // P = loanAmount
        // r = monthlyInterestRate / 12
        // n = paybackTimeMonths

        double annualInterestRate = loanType.getInterestRate();
        double monthlyInterestRate = annualInterestRate / 12;

        double monthlyPayment = loanAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, paybackTimeMonths))
                / (Math.pow(1 + monthlyInterestRate, paybackTimeMonths) - 1);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.println("Monthly Payment: " + decimalFormat.format(monthlyPayment));
    }
}