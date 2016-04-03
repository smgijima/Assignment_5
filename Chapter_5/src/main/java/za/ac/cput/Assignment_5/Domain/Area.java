package za.ac.cput.Assignment_5.Domain;

/**
 * Created by mgijma on 2016/04/03.
 */
public class Area {

    private String name;
    private String adress;



    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    private Area() {

    }

    private Area(Builder builder) {
        this.name = builder.name;
        this.adress = builder.adress;

    }

    public static class Builder{
        private String name;
        private String adress;


        public Builder (String name){
            this.name = name;

        }
        public Builder adress(String adress){
            this.adress = adress;
            return this;

        }


        public Builder copy(Area value) {
            this.name = value.name;
            this.adress = value.adress;
            return this;
        }

        public Area build() {
            return new Area(this);
        }
    }
}
