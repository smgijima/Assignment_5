package za.ac.cput.Assignment_5.Domain;

/**
 * Created by mgijma on 2016/04/06.
 */
public class Payment {

        private String Amount;
        private String FromAccount;
        private String ToAccount;



        public String getAmount() {
            return Amount;
        }

        public String getFromAccount(){
            return FromAccount;
        }

        public String getToAccount() {
            return ToAccount;
        }

        private Payment() {

        }

        private Payment(Builder builder) {
            this.Amount = builder.Amount;
            this.FromAccount = builder.FromAccount;
            this.ToAccount = builder.ToAccount;

        }

        public static class Builder{
            private String Amount;
            private String FromAccount;
            private String ToAccount;




            public Builder (String Amount){
                this.Amount = Amount;

            }
            public Builder FromAccount(String FromAccount){
                this.FromAccount = FromAccount;
                return this;
            }

            public Builder ToAccount(String ToAccount){
                this.ToAccount = ToAccount;
                return this;
            }


            public Builder copy(Payment value) {
                this.Amount = value.Amount;
                this.FromAccount = value.FromAccount;
                this.ToAccount = value.ToAccount;
                return this;
            }

            public Payment build() {
                return new Payment(this);
            }
        }
    }


