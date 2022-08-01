package animal;

public class Duck extends Animal{

    private float wingspan;
    private boolean canFly;

    public float getWingspan() {
        return wingspan;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String speak() {
        return "QUACKQUACKQUACK";
    }

    @Override
    public int lifeSpan() {
        return 7;
    }

    @Override
    boolean canCrawl() {
        return false;
    }
}
