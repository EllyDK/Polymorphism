package P02_AnimalFarm;

public class Chicken {
    private String name;
    private int age;


    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.length() >= 1){
            this.name = name;
        }else {
            throw new IllegalArgumentException
                    ("Name cannot be empty.");
        }
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        if (age >= 0 && age <= 15){
            this.age = age;
        }else throw new IllegalArgumentException
                ("Age should be between 0 and 15.");
    }

    public double productPerDay (){
        return this.calculateProductPerDay();
    }

    private double calculateProductPerDay(){
        if (this.getAge() >= 0 && this.getAge() <= 5){
            return 2;
        }else if (this.getAge() >= 6 && this.getAge() <= 11){
            return 1;
        }else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return String.format
                ("Chicken %s (age %d) can produce %.2f eggs per day.",
                        this.getName(), this.getAge(), this.productPerDay());
    }
}
