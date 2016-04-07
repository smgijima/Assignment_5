package za.ac.cput.Assignment_5.Domain;

/**
 * Created by mgijma on 2016/04/07.
 */
public class BusStation {

    private String BusStationCode;
    private String Name;
    private String City;
    private String Code;

    public String getName() {
        return Name;
    }

    public String getCode() {
        return Code;
    }

    public String getCity() {
        return City;
    }

    public String getBusStationCode() {
        return BusStationCode;
    }


    private BusStation() {

    }

    private BusStation(Builder builder) {
        this.BusStationCode = builder.BusStationCode;
        this.Name = builder.Name;
        this.City = builder.City;
        this.Code = builder.Code;
    }

    public static class Builder{

        private String BusStationCode;
        private String Name;
        private String City;
        private String Code;;


        public Builder (String busStationCode){
            this.BusStationCode = busStationCode;

        }
        public Builder Name(String name){
            this.Name = name;
            return this;
        }

        public Builder City(String city){
            this.City = city;
            return this;
        }

        public Builder Code(String code){
            this.Code = code;
            return this;
        }

        public Builder copy(BusStation value) {
            this.BusStationCode = value.BusStationCode;
            this.Name = value.Name;
            this.City = value.City;
            this.Code = value.Code;
            return this;
        }

        public BusStation build() {
            return new BusStation(this);
        }
    }

}
