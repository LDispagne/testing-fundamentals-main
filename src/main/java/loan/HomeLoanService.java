package loan;

public class HomeLoanService {
    /**
     * For property price smaller than 150_000.00, we will require only 15% down payment.
     * For property price greater or equal to 150_000.00, we will require 20% down payment.
     *
     * If the account has enough balance to cover the down payment, the loan request should
     * be granted. If there isn't enough balance, the request should be rejected.
     */

    public boolean applyForHomeLoan(double accountBalance, double propertyPrice) {
        double percentage = propertyPrice >= 150_000 ? 0.2 : 0.15;
        double downPaymentValue = propertyPrice * percentage;

            // ternary
//        if (propertyPrice >= 150_000) {
//            percentage = 0.2;
//
//        } else {
//            percentage = 0.15;
//        }


        return accountBalance >= downPaymentValue;
    }

}
