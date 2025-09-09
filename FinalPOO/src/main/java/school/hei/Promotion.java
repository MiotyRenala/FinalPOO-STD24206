package school.hei;

import java.time.LocalDate;

public class Promotion {
    private LocalDate date;
    private String reason;
    private float newValue;

    public Promotion(LocalDate date, String reason, float newValue) {
        this.date = date;
        this.reason = reason;
        this.newValue = newValue;
    }

}
