public class DataTypes {
    public static void main(String[] args) {
        // First comment

        /* Hello World
        I am working on this file
        Please do not hesitate to ask me
        If you have a questions!
         */

        // Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);

        // Variables: double
        double temperature = 3.4;
        double price = 999.99;
        System.out.println(temperature);
        System.out.println(price);

        // Variables: float
        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        // Casting
        int areaInteger = (int) area;
        System.out.println(areaInteger);
        System.out.println(Math.round(area));

        // Char
        char symbol = '$';
        System.out.println(symbol);

        // Exercise: Declare a variable for each character present in the length of my name.
        char n = 78; // N
        System.out.println(n);

        // Boolean is / has (returns true or false)
        boolean isRaining = false;
        boolean hasPassedExercise = true;
        boolean isSummer = false;
        System.out.println(isRaining);
        System.out.println(hasPassedExercise);
        System.out.println(isSummer);
    }
}
