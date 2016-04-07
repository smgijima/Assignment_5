package za.ac.cput.Assignment_5.Domain;

/**
 * Created by mgijma on 2016/04/07.
 */
public class BusDetails {

    private String BusNo;
    private String BusType;
    private String NoOfSeats;

    public String getBusNo() {
        return BusNo;
    }

    public String getBusType() {
        return BusType;
    }

    public String getNoOfSeats() {
        return NoOfSeats;
    }

    private BusDetails() {

    }

    private BusDetails(Builder builder) {
        this.BusNo = builder.BusNo;
        this.BusType = builder.BusType;
        this.NoOfSeats = builder.NoOfSeats;

    }

    public static class Builder{

        private String BusNo;
        private String BusType;
        private String NoOfSeats;


        public Builder (String busNo){
            this.BusNo = busNo;

        }
        public Builder Bustype(String busType){
            this.BusType = busType;
            return this;
        }

        public Builder Noofseats(String noOfSeats){
            this.NoOfSeats = noOfSeats;
            return this;
        }


        public Builder copy(BusDetails value) {
            this.BusNo = value.BusNo;
            this.BusType = value.BusType;
            this.NoOfSeats = value.NoOfSeats;
            return this;
        }

        public BusDetails build() {
            return new BusDetails(this);
        }
    }
}
