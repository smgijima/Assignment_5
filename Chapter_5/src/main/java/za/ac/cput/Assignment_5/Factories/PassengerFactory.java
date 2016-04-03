package za.ac.cput.Assignment_5.Factories;

import za.ac.cput.Assignment_5.Domain.Passenger;

/**
 * Created by mgijma on 2016/04/03.
 */
public class PassengerFactory {

    public static Passenger getPassenger(String name, String surname, String age)
    {
        Passenger myPassenger = new Passenger.Builder(name)
                .surname(surname)
                .age(age)
                .build();

        return myPassenger;

    }
}
