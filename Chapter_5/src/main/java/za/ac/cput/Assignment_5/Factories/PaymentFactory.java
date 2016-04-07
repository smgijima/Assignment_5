package za.ac.cput.Assignment_5.Factories;

import za.ac.cput.Assignment_5.Domain.Payment;

/**
 * Created by mgijma on 2016/04/06.
 */
public class PaymentFactory {
    public static Payment getPayment(String Amount, String FromAmount, String ToAccount) {
        Payment myPayment = new Payment.Builder(Amount)
                .FromAccount(FromAmount)
                .ToAccount(ToAccount)
                .build();

        return myPayment;
    }
}
