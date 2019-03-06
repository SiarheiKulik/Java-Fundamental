package by.company.task07;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    private List<Flower> flowers = new ArrayList<Flower>();
    private List<Accessory> accessories = new ArrayList<Accessory>();
    private int bouquetPrice;

    public Bouquet(int roses, int chrysanthemums, int mayweeds, int cornflowers, boolean wrapper, boolean ribbon) {

        for (int i = 0; i < roses; i++) {
            flowers.add(new Rose());
        }
        for (int i = 0; i < chrysanthemums; i++) {
            flowers.add(new Chrysanthemum());
        }
        for (int i = 0; i < mayweeds; i++) {
            flowers.add(new Mayweed());
        }
        for (int i = 0; i < cornflowers; i++) {
            flowers.add(new Cornflower());
        }
        if (wrapper) {
            accessories.add(new Wrapper());
        }
        if (ribbon) {
            accessories.add(new Ribbon());
        }

    }

    public void addToBouquet(Flower flower){
        flowers.add(flower);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public int getBouquetPrice() {
        int result = 0;
        for(int i = 0; i < flowers.size(); i ++){
            result += flowers.get(i).getPrice();
        }
        for (int i = 0; i < accessories.size(); i++){
            result+=accessories.get(i).getPrice();
        }
       return result;
    }

    public List sortFlowersByFreshness() {
        for(int j = flowers.size() - 1; j >= 0; j--){
            for(int i = 0; i < j; i++){
                if(flowers.get(i).getFreshness() > flowers.get(i + 1).getFreshness()){
                    Flower temp = flowers.get(i);
                    flowers.set(i, flowers.get(i + 1));
                    flowers.set(i + 1, temp);
                }
            }
        }
        return flowers;
    }


    public String findStemLength(int minLength, int maxLength){
        String result = "Stem Length: " + minLength + "-" + maxLength + " cm. \n";
        for(int i = 0; i < flowers.size(); i++){
            if(flowers.get(i).getStemLength() >= minLength && flowers.get(i).getStemLength() <= maxLength){
                result += flowers.get(i);
            }
        }
        return result;
    }

}
