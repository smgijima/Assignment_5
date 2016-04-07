package za.ac.cput.Assignment_5.Singleton;

/**
 * Created by mgijima on 2016/04/07.
 */
public class CalculatePayment {

        private static CalculatePayment calculatePayment= null;

        private CalculatePayment() {

        }

        public static CalculatePayment getInstance(){
            if(calculatePayment ==null){
                calculatePayment = new CalculatePayment();
            }
            return calculatePayment;
        }

        public double calculate(double w, double l) {
            return w + l;
        }

}
