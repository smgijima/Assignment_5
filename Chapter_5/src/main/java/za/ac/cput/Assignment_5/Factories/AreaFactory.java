package za.ac.cput.Assignment_5.Factories;

import za.ac.cput.Assignment_5.Domain.Area;

/**
 * Created by mgijima on 2016/04/03.
 */
public class AreaFactory {

    public static Area getArea(String name, String adress) {
        Area myClass = new Area.Builder(name)
                .adress(adress)
                .build();

        return myClass;
    }
}
