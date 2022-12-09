import java.text.DecimalFormat;
import java.util.EmptyStackException;

public class Flower {

    private String flowerName;
    private String country;
    private double cost;
    private Integer lifeSpan;
    private DecimalFormat dF = new DecimalFormat( "#.##" );

    public Flower(String flowerName, String country, double cost, Integer lifeSpan) {
        setFlowerName(flowerName);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public void setLifeSpan(Integer lifeSpan) {
        if (lifeSpan == null || lifeSpan <= 0) {
            lifeSpan = 3;
        }
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return "Цветок: " + flowerName +
                ", страна происхождения " + country +
                ", стоимость " + dF.format(cost) +
                " руб., срок стояния " + lifeSpan + " дн.";
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerName(String flowerName) {
        if (flowerName == null || flowerName.isBlank() || flowerName.isEmpty()) {
            flowerName = "Тип цветка не указан";
        }
        this.flowerName = flowerName;
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank() || country.isEmpty()) {
            country = "Россия";
        }
        this.country = country;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            cost = 1;
        }
        this.cost = cost;
    }
}
