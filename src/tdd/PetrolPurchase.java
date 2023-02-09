package tdd;

public class PetrolPurchase {

    private String location;
    private String typeOfPetrol;
    private int quantity;
    private double price;
    private double discount;

    public PetrolPurchase (String location, String typeOfPetrol, int quantity, double price, double discount) {
            this.location = location;
            this.typeOfPetrol = typeOfPetrol;
            this.quantity = quantity;
            this.price = price;
            this.discount = discount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        double pricePerLitre = 100;
        this.price = price * pricePerLitre;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getLocation() {
        return location;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }


    public double getPurchase() {
        double netPurchaseAmount = (quantity * price) - discount;
        return netPurchaseAmount;
    }
}

