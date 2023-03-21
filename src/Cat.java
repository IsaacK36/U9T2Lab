public class Cat extends Animal {
    boolean hasPlayedWith;
    boolean hasBrushed;

    public Cat(String name, int age, int feet, boolean vaccinated) {
        super(name, age, feet, vaccinated);
        hasPlayedWith = false;
        hasBrushed = false;
    }

    public void play() {
        System.out.println("played");
        hasPlayedWith = true;
    }

    public void brush() {
        System.out.println("brushed");
        hasBrushed = true;
    }

    public boolean getHasPlayedWith() {
        return hasPlayedWith;
    }

    public boolean getBrushed() {
        return hasBrushed;
    }
}
