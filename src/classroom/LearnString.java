package classroom;

public class LearnString {
    public static void main(String[] args) {

        // String
        String name = "Nikita";
        String lastName = "Milka";

        System.out.println(name);
        System.out.println(lastName);

        // Exercise: Print name and surname (Example: John Doe);
        // Concatenation
        String fullName = name + " " + lastName; // Nikita Milka
        System.out.println(fullName);

        // Same example
        System.out.println(name + " " + lastName);
        System.out.println(String.format("%s %s", name, lastName));

        // Can save into variable
        String myFullName = String.format("%s %s", name, lastName);
        System.out.println(myFullName);

        // Hello, world!
        String hello = "Hello, ";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        // Exercise:
        // Step 1: Declare a string variable with your name;
        // Step 2: Declare a string variable with your favorite programming language
        // Step 3: Concatenate the two strings to form a message 'My name is {NAME}. I love coding in {PLANGUAGE}';
        // Step 4: Print it out;

        String randomString = "some text";
        System.out.println(randomString.toUpperCase());
    }
}
