public class Flower {

    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerName = flowerName;
        this.setFlowerColor(flowerColor);
        this.setCountry(country);
        this.setCost(cost);
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public Flower(String flowerName, String flowerColor, String country, double cost) {
        this(flowerName, flowerColor, country, cost, 3);
    }
    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public void flowerInfo() {
        System.out.println(flowerName + " страна происхождения - " + country + ", цвет - " + flowerColor + ", стоимость штуки - " + cost + " рублей, срок стояния - " + lifeSpan + " дней");
    }
}


