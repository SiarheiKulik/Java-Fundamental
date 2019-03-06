package by.company.task07;

public abstract class Accessory {

    private int price;

    public Accessory(int price) {
        this.price = price;
    }
    public Accessory(){}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Accessory{" +
                "price=" + price +
                '}';
    }
}
