package za.ac.cput.Assignment_5.Factories;

import za.ac.cput.Assignment_5.Domain.BusClass;

/**
 * Created by mgijma on 2016/04/03.
 */
public class BusFactory {
    public static BusClass getBussclass(String tickets, String type, String one_way_or_return) {
        BusClass myClass = new BusClass.Builder(tickets)
                .type(type)
                .oneWayOrReturn(one_way_or_return)
                .build();

        return myClass;
    }
}
