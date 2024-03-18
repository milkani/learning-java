package classroom;

public class PlayWithObjects {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        System.out.println(barsik.getName());

        barsik.setName("Barsik");
        barsik.setAge(1);
        barsik.setColor("gray");
        System.out.println(barsik.getName());

        Animal leo = new Animal();
        leo.setName("Leo");
        leo.setAge(2);
        leo.setColor("ginger");
        System.out.println(leo.getName());

        System.out.println(barsik);
        System.out.println(leo);

        barsik.walk();
        leo.walk();

        barsik.eat();
        leo.eat();

        // Create 2 objects
        // Update information for each
        // Call walk and eat;

        Animal jerry = new Animal();
        jerry.setName("Jerry");
        jerry.setColor("Purple");
        jerry.setAge(3);

        jerry.walk();
        jerry.eat();

        System.out.println(jerry);
    }
}
