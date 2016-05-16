package pojos;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by KIRILL on 14.05.2016.
 */
@Entity
@Table(name = "user",uniqueConstraints = {
        @UniqueConstraint(columnNames = "userId"),
        @UniqueConstraint(columnNames = "login")
})
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "userId", unique = true, nullable = false)
    private int userId;

    @Column( name = "firstname", unique = true, nullable = false,length = 20)
    private String firstname;
    @Column( name = "secondname", unique = true, nullable = false,length = 20)
    private String secondname;
    @Column( name = "login", unique = true, nullable = false,length = 20)
    private String login;
    @Column( name = "password", unique = true, nullable = false,length = 20)
    private String password;
    @Column( name = "email", unique = true, nullable = false,length = 20)
    private String email;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade=CascadeType.ALL)
    private UserDetails userDetails;



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    //  ---

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    //  ---

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    //  ---

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    //  ---

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //  ---

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //  ---

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
