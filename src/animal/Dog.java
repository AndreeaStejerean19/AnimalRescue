package animal;

public class Dog extends Animal{
    public void canBark(){ //method
        System.out.println("Hamhamhamhamham");
    }
    private boolean waggingTheTail; //atribut=info despre obiect: varsta, culoare
    public boolean isWaggingTheTail() {
        return waggingTheTail;
    }
    public void setWaggingTheTail(boolean waggingTheTail) {
        this.waggingTheTail = waggingTheTail;
    }

    private String race;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
