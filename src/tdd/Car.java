package tdd;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
        if (price>0) this.price = price;
        //applyDiscount(10);
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }

    public void applyDiscount(int discountRate) {
        double discount = (discountRate/100) * price;
        price = price - discount;

    }

}
