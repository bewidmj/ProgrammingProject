package programming;

public class SimpleInterestCalculator {

    /**
     * Calculates simple interest using the formula: SI = (P * R * T) / 100
     *
     * @param principal The principal amount (P)
     * @param rate The rate of interest per annum (R)
     * @param time The time period in years (T)
     * @return The simple interest amount
     */
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    /**
     * Calculates compound interest using the formula: A = P(1 + r/n)^(nt)
     *
     * @param principal The principal amount (P)
     * @param rate The annual interest rate as a decimal (e.g., 5% = 0.05) (r)
     * @param time The time period in years (t)
     * @param compoundingFrequency The number of times interest is compounded per year (n)
     * @return The compound interest amount
     */
    public static double calculateCompoundInterest(double principal, double rate, double time, int compoundingFrequency) {
        double amount = principal * Math.pow(1 + (rate / compoundingFrequency), compoundingFrequency * time);
        return amount - principal;
    }

    /**
     * Calculates the total amount with compound interest
     *
     * @param principal The principal amount (P)
     * @param rate The annual interest rate as a decimal (e.g., 5% = 0.05) (r)
     * @param time The time period in years (t)
     * @param compoundingFrequency The number of times interest is compounded per year (n)
     * @return The total amount (principal + compound interest)
     */
    public static double calculateTotalAmountWithCompoundInterest(double principal, double rate, double time, int compoundingFrequency) {
        return principal * Math.pow(1 + (rate / compoundingFrequency), compoundingFrequency * time);
    }

    // Example usage in main method
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 5.0; // 5% per annum
        double time = 2.0; // 2 years
        int compoundingFrequency = 12; // Compounded monthly

        // Simple Interest calculations
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        double totalAmountSimple = calculateTotalAmount(principal, rate, time);

        System.out.println("=== SIMPLE INTEREST ===");
        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "% per annum");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: $" + simpleInterest);
        System.out.println("Total Amount: $" + totalAmountSimple);

        // Compound Interest calculations
        double compoundInterest = calculateCompoundInterest(principal, rate/100, time, compoundingFrequency);
        double totalAmountCompound = calculateTotalAmountWithCompoundInterest(principal, rate/100, time, compoundingFrequency);

        System.out.println("\n=== COMPOUND INTEREST ===");
        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "% per annum (compounded monthly)");
        System.out.println("Time: " + time + " years");
        System.out.println("Compounding Frequency: " + compoundingFrequency + " times per year");
        System.out.println("Compound Interest: $" + String.format("%.2f", compoundInterest));
        System.out.println("Total Amount: $" + String.format("%.2f", totalAmountCompound));
    }
}