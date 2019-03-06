package by.company.task07;

public abstract class Flower {

    private int freshness;
    private  int stemLength;
    private int price;

    public Flower(){}

    public Flower(int freshness, int stemLength, int price) {
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
