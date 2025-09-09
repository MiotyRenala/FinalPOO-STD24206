package school.hei;

import java.time.LocalDate;
import java.util.List;

public class Prestataire extends Travailleur {
    private double TJM;
    private List<Promotion> promotions;

    public Prestataire(int id, String firstName, String lastName, String email, long phoneNumber, List<LocalDate> pointages, double TJM, List<Promotion> promotions) {
        super(id, firstName, lastName, email, phoneNumber, pointages);
        this.TJM = TJM;
        this.promotions = promotions;
    }
}
