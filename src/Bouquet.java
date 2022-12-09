import java.text.DecimalFormat;
import java.util.Arrays;

public class Bouquet {

    private Flower[] flowers;

    private DecimalFormat dF = new DecimalFormat( "#.##" );

    public Bouquet(Flower[] flower) {
        this.flowers = flower;
    }

    public String printFlowersNames() {
        StringBuilder s = new StringBuilder("");
        for (Flower flower : flowers) {
            if (flower != null)
                s.append(flower).append("\n");
        }
        return s.toString();
    }

    private double calculatePriceOfBouquet() {
        double priceOfBouquet = 0;
        for (Flower flower : flowers) {
            if (flower != null)
                priceOfBouquet += flower.getCost();
        }
        return priceOfBouquet * 1.1;
    }

    private int calculateLifeSpanOfBouquet() {
        int lifeSpanOfBouquet = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower != null && flower.getLifeSpan() < lifeSpanOfBouquet) {
                lifeSpanOfBouquet = flower.getLifeSpan();
            }
        }
        return lifeSpanOfBouquet;
    }

    @Override
    public String toString() {
        return "Состав букета: \n" + printFlowersNames() +
                "Стоимость букета " + dF.format(calculatePriceOfBouquet()) + " руб.\n" +
                "Срок стояния букета " + calculateLifeSpanOfBouquet() + " дн.";
    }
}
