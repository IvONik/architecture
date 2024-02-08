package HW4;

import java.util.Date;

public class Ticket {
    private int id;
    private double price;
    private int place;
    private Date  date;
    private boolean isValid;

    public Ticket(int id, double price, int place, Date date, boolean isValid) {
        this.id = id;
        this.price = price;
        this.place = place;
        this.date = date;
        this.isValid = isValid;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getPlace() {
        return place;
    }

    public Date getDate() {
        return date;
    }

    public boolean isValid() {
        return isValid;
    }

}
