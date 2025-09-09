package school.hei;

import java.time.LocalDate;
import java.util.List;

public class Travailleur {
    private int id ;
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;
    private List<LocalDate> pointages;

    public Travailleur(int id, String firstName, String lastName, String email, long phoneNumber, List<LocalDate> pointages ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pointages = pointages;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
