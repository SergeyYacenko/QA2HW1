import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanTotalSumTest {

    @Test
    public void loanTotalSumTest() {

       float needed = 10; /* amount, that client needs*/
       float percentagePayment = needed / 100 * 10 + needed / 100 * 8 + needed /100 * 6; /*precentage payment in 30 years*/
       float totalAmountToPay = needed + percentagePayment; /* total amount to pay */
       float senseisResult = 12; /*Sensei Dmitry, please enter your calculation result here*/

        Assertions.assertEquals(totalAmountToPay, senseisResult, "Total sum is not correct ");
    }
}


