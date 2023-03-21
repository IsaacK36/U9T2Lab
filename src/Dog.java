public class Dog extends Animal {
    boolean hasBeenWalked;
    boolean hasBeenWashed;

    public Dog(String name, int age, int feet, boolean vaccinated) {
        super(name, age, feet, vaccinated);
        hasBeenWalked = false;
        hasBeenWashed = false;
    }

    public void walk() {
        System.out.println("walk done");
        hasBeenWalked = true;
    }

    public void wash() {
        System.out.println("washed");
        hasBeenWashed = true;
    }

    public boolean getHasBeenWalked() {
        return hasBeenWalked;
    }

    public boolean getHasBeenWashed() {
        return hasBeenWashed;
    }
}
