package by.company.task07;

public class Ribbon extends Accessory {

    public Ribbon(){}


    public Ribbon(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Ribbon. Price: $" + getPrice();
    }
}
