package pojos;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by KIRILL on 14.05.2016.
 */
@Entity
@Table(name = "UserDetails")
public class UserDetails implements Serializable {


    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @org.hibernate.annotations.Parameter(name = "property", value = "user"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "userId", unique = true, nullable = false)
    private int userId;
    @Column(name = "country", nullable = false, length = 100)
    private String country;
    @Column(name = "city", nullable = false, length = 100)
    private String city;
    @Column(name = "state", nullable = false, length = 100)
    private String state;
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private User user;

    public int getUserId() {return userId;}

    public void setUserId(int userId) {
        this.userId = userId;
    }

    //  ---

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //  ---

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //  ---

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //  ---
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
