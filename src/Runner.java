public class Runner {
    public static void main(String[] args) {
        System.out.println("--Animal Class Test----------");
        Animal animal1 = new Animal("bob", 5, 4, false);
        System.out.println(animal1.getName());
        System.out.println(animal1.getAge());
        System.out.println(animal1.getFeet());
        System.out.println(animal1.getVaccinated());
        animal1.adopt();
        animal1.feed();
        animal1.pet();

        System.out.println("--Dog Class Test-------------");
        Dog dog1 = new Dog("jeff", 8, 3, true);
        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        System.out.println(dog1.getFeet());
        System.out.println(dog1.getVaccinated());
        dog1.adopt();
        dog1.feed();
        dog1.pet();
        dog1.getHasBeenWashed();
        dog1.wash()


        System.out.println("--Cat Class Test-------------");
    }
}
