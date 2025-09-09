package school.hei;

import java.time.LocalDate;
import java.util.List;

public class Salarie extends Travailleur {
    private double mensualSalary;
    private List<Promotion> promotions;

    public Salarie(int id, String firstName, String lastName, String email, long phoneNumber, List<LocalDate> pointages, double mensualSalary, List<Promotion> promotions) {
        super(id, firstName, lastName, email, phoneNumber, pointages);
        this.mensualSalary = mensualSalary;
        this.promotions = promotions;
    }
}
