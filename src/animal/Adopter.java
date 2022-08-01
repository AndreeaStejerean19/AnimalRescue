package animal;

public class Adopter {
    private String name;
    private int budget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }


    @Override
    public String toString() {
        return "The adopters are: " +
                "Name='" + name + '\'' +
                ", Budget=" + budget;
    }
}
