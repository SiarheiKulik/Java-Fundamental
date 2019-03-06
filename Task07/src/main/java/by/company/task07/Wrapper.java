package by.company.task07;

public class Wrapper extends Accessory {

    public Wrapper(int price) {
        super(price);
    }

    public Wrapper() { }

    @Override
    public String toString() {
        return "Wrapper Price: $ " + getPrice();
    }
}
