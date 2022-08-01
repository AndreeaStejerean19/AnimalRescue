package animal;

public class Cat extends Animal{
    private boolean canMeow;

    public boolean isCanMeow() {
        return canMeow;
    }

    public void setCanMeow(boolean canMeow) {
        this.canMeow = canMeow;
    }

    @Override
    public String speak() {
        return "MEOWMEOWMEOW";
    }

    @Override
    public int lifeSpan() {
        return 12;
    }
}
