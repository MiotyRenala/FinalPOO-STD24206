package school.hei;

import java.time.LocalDate;

public class Pointage {
    private LocalDate date;
    private TypeOfWork type;
    private float quota;
    private String description;

    public Pointage(LocalDate date, TypeOfWork type, float quota, String description) {
        this.date = date;
        this.type = type;
        this.quota = quota;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TypeOfWork getType() {
        return type;
    }

    public void setType(TypeOfWork type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuota(float quota) {
        if(quota > 0 && quota < 1){
            this.quota = quota;
        }else {
            System.out.println("Le quota doit être compris entre 0 et 1");
        }

    }





}
