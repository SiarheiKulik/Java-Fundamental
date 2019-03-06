package by.company.task07;

public class Cornflower extends Wildflower {

    public Cornflower(int freshness, int stemLength, int price) {
        super(freshness, stemLength, price);
    }

    Cornflower() {
        super(2, (int)(5 + (Math.random() * 3)), 1);
    }

    @Override
    public String toString() {
        String day = "day";
        if(getFreshness()>1){
            day = " days";
        }

        return "This CORNFLOWER freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                "price:" + " $" + getPrice() + ". \n";
    }
}
