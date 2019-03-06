package by.company.task07;

public class Mayweed extends Wildflower {

    public Mayweed(int freshness, int stemLength, int price) {
        super(freshness, stemLength, price);
    }
    public Mayweed(){
        super(2,((int)(5 + Math.random()*4)), 2);
    }

    @Override
    public String toString() {
        String day = " day";
        if(getFreshness()>1){
            day = " days";
        }

        return "This MAYWEED freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                "price:" + " $" + getPrice() + ". \n";
    }
}
