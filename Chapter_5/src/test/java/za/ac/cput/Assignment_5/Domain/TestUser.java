package za.ac.cput.Assignment_5.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Assignment_5.Factories.UserFatory;

/**
 * Created by mgijma on 2016/04/06.
 */
public class TestUser {

    private User user;


    @Before
    public void setUp() throws Exception {

        user = UserFatory.getUser("smgijima","12345","D200");
    }

    @Test
    public void testClass() throws Exception {
        Assert.assertEquals(user.getUserID(),"smgijima");
        Assert.assertEquals(user.getPassword(), "12345");
        Assert.assertEquals(user.getUserType(),"D200");
    }

    @Test
    public void testNewUpdate() throws Exception {
        User userUpdate = new User.Builder(user.getUserID())
                .copy(user)
                .Password("smgijima")
                .UserType("D200")
                .build();
        Assert.assertEquals(user.getUserID(), "smgijima");
        Assert.assertEquals(user.getPassword(), "12345");
        Assert.assertEquals(user.getUserType(), "D200");
    }
}
