package za.ac.cput.Assignment_5.Factories;

import za.ac.cput.Assignment_5.Domain.BusRegistration;

/**
 * Created by mgijma on 2016/04/07.
 */
public class BusRegFactory {


    public static BusRegistration getReg(String regNum, String date) {
        BusRegistration myReg = new BusRegistration.Builder(regNum)
                .Date(date)
                .build();

        return myReg;
    }
}
