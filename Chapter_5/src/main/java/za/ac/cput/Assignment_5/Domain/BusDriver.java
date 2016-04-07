package za.ac.cput.Assignment_5.Domain;

/**
 * Created by mgijima on 2016/04/03.
 */
public class BusDriver{

    private String name;
    private String surname;
    private String emp_num;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getStuff_Num() {
        return emp_num;
    }
    private BusDriver() {

    }

    private BusDriver(Builder builder) {
        this.emp_num= builder.Stuff_Num;
        this.name= builder.name;
        this.surname = builder.surname;

    }

    public static class Builder{
        private String Stuff_Num;
        private String name;
        private String surname;


        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;

        }
        public Builder (String Stuff_Num){
            this.Stuff_Num = Stuff_Num;
        }

        public Builder copy(BusDriver value) {
            this.name = value.name;
            this.surname = value.surname;
            this.Stuff_Num = value.emp_num;
            return this;
        }

        public BusDriver build() {
            return new BusDriver(this);
        }
    }


}
