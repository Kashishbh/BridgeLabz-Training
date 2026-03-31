import java.util.Arrays;
import java.util.List;

public class NameUppercasing {
    public static void main(String[] args) {

        List<String> employeeNames =
                Arrays.asList("Karan", "Ankita", "Subhash", "Nita");
        employeeNames.stream()
                     .map(String::toUpperCase)   // method reference
                     .forEach(System.out::println);
    }
}
