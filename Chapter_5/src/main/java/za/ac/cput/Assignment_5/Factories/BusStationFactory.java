package za.ac.cput.Assignment_5.Factories;

import za.ac.cput.Assignment_5.Domain.BusStation;

/**
 * Created by mgijma on 2016/04/07.
 */
public class BusStationFactory {

    public static BusStation getStation(String BusStationCode, String Name, String City, String Code) {
         BusStation station = new BusStation.Builder(BusStationCode)
                .Name(Name)
                .City(City)
                .Code(Code)
                .build();

        return station;
    }
}
