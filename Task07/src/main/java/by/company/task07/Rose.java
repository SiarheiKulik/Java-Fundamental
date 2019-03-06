package by.company.task07;

public class Rose extends HotHouseFlower {

    public Rose(int freshness, int stemLength, int price) {

        super(freshness, stemLength, price);
    }

    public Rose() {

        super(4, ((int) (20 + Math.random() * 20)), 5);
    }


    @Override
    public String toString() {
        String day = " day";
        if (getFreshness() > 1) {
            day = " days";
        }
        return "This ROSE freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                "price:" + " $" + getPrice() + ". \n";
    }
}
