import java.util.Locale;

public class ExercicioPrint {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5430;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.60;
        double measure = 53.103221;

        System.out.println("Product:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);


        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);

        System.out.printf("Measure with 8 decimal places: %.8f%n", measure);
        System.out.printf("Rouded(3 decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
