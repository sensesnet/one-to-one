import Dao.UserDao;
import Dao.UserDetailDao;
import Dao.Factory;
import pojos.User;
import pojos.UserDetails;

import java.sql.SQLException;

/**
 * Created by KIRILL on 15.05.2016.
 */
public class projectApp {
    public static void main(String[] args) throws SQLException {

        System.out.println("Hibernate one to one mapping from Annotation");

        Factory factory = Factory.getInstanse();                         // get dao
        UserDao userDao = factory.getUserDao();
        //UserDetailDao userDetailDao = factory.getUserDetailDao();

        System.out.println("Start add new user");

        User user = new User();                       // first set fields from new user
        user.setFirstname("kirill");
        user.setSecondname("Degt");
        user.setLogin("test");
        user.setPassword("test");
        user.setEmail("test@test.com");
        System.out.println("set fields from new user");


        UserDetails userDetails = new UserDetails();      //second set fields from user details
        userDetails.setCountry("USA");
        userDetails.setCity("NY");
        userDetails.setState("state");
        System.out.println("set fields from user detail");

        //set to "user" pojos "userDetails"
        user.setUserDetails(userDetails);
        //set to "userDetails" pojos "user"
        userDetails.setUser(user);

        // add new user to table
        userDao.add(user);
        System.out.println("new user add");


    }
}
