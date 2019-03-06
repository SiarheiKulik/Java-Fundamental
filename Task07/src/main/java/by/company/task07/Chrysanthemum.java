package by.company.task07;

public class Chrysanthemum extends HotHouseFlower {


    public Chrysanthemum(int freshness, int stemLength, int price) {
        super(freshness, stemLength, price);
    }
    public Chrysanthemum(){
        super(4, ((int)(40 + Math.random()*20)), 3);
    }

    @Override
    public String toString() {
        String day = " day";
        if(getFreshness() > 1){
            day = " days";
        }
        return "This ROSE freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                "price:" + " $" + getPrice() + ". \n";
    }
}
