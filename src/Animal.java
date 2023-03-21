public class Animal {
    String name;
    int age;
    int feet;
    boolean vaccinated;
    public Animal(String name, int age,  int feet, boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.feet = feet;
        this.vaccinated = vaccinated;
    }

    public void adopt() {
        System.out.println(("adopted"));
    }

    public void feed() {
        System.out.println("fed");
    }

    public void pet() {
        System.out.println("petted");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getFeet() {
        return feet;
    }

    public boolean getVaccinated() {
        return vaccinated;
    }
}
