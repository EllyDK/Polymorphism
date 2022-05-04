package P04_PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;


    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    public String getToppingType() {
        return this.toppingType;
    }

    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")){
            this.toppingType = toppingType;
        }else {
            throw new IllegalArgumentException
                    ("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    public double getWeight() {
        return this.weight;
    }

    private void setWeight(double weight) {
        if (weight >= 2 && weight <= 50){
            this.weight = weight;
        }else {
            throw new IllegalArgumentException
                    (this.getToppingType() + " weight should be in the range [1..50].");
        }
    }

    public double calculateCalories (){
        double toppingTypeCoefficient = 0;
        switch (this.toppingType) {
            case "Meat":
                toppingTypeCoefficient = 1.2;
                break;
            case "Veggies":
                toppingTypeCoefficient = 0.8;
                break;
            case "Cheese":
                toppingTypeCoefficient = 1.1;
                break;
            case "Sauce":
                toppingTypeCoefficient = 0.9;
                break;
        }

        return 2 * this.weight * toppingTypeCoefficient;
    }
}
