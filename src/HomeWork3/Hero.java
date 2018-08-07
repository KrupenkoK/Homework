package HomeWork3;

public abstract class Hero {

    private int health = 100;
    private boolean isBuffed;
    private Race race;

    public Hero(boolean isBuffed, Race race) {
        this.isBuffed = isBuffed;
        this.race = race;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isBuffed() {
        return isBuffed;
    }

    public void setBuffed(boolean buffed) {
        isBuffed = buffed;
    }

    public boolean isAlive() {
        return health > 0;
    }

}
