package za.ac.cput.Assignment_5.Domain;

/**
 * Created by mgijima on 2016/04/03.
 */
public class Passenger {


        private String name;
        private String surname;
        private String age;

        public String getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }
        private Passenger() {

        }

        private Passenger(Builder builder) {
            this.name = builder.name;
            this.surname = builder.surname;
            this.age = builder.age;
        }

        public static class Builder{
            private String name;
            private String surname;
            private String age;

            public Builder age(String value){
                this.age = value;
                return this;
            }
            public Builder (String name){
                this.name = name;

            }
            public Builder surname(String surname){
                this.surname = surname;
                return this;
            }

            public Builder copy(Passenger value) {
                this.name = value.name;
                this.surname = value.surname;
                this.age = value.age;
                return this;
            }

            public Passenger build() {
                return new Passenger(this);
            }
        }


    }

