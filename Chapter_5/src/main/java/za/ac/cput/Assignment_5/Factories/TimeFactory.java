package za.ac.cput.Assignment_5.Factories;

import za.ac.cput.Assignment_5.Domain.Time;

/**
 * Created by mgijma on 2016/04/03.
 */
public class TimeFactory {

    public static Time getArea(String hour, String minutes) {
        Time myClass = new Time.Builder(hour)
                .minutes(minutes)
                .build();

        return myClass;
    }
}
