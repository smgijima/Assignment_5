package za.ac.cput.Assignment_5.Factories;

import za.ac.cput.Assignment_5.Domain.User;

/**
 * Created by mgijma on 2016/04/06.
 */
public class UserFatory {

    public static User getUser(String userid, String password, String usertype) {
        User myUser = new User.Builder(userid)
                .Password(password)
                .UserType(usertype)
                .build();

        return myUser;
    }
}
