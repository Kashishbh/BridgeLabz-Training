package objectToJSONArray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;
public class objectToJSONArray {
    public static void main(String[] args) throws Exception {
        List<Car> cars=Arrays.asList(
                new Car("Toyota","Fortuner",2023),
                new Car("Honda","City",2022),
                new Car("Hyundai","Creta",2021)
        );
        ObjectMapper mapper = new ObjectMapper();
        // Convert list to JSON array
        String jsonArray = mapper.writerWithDefaultPrettyPrinter()
                                 .writeValueAsString(cars);
        System.out.println(jsonArray);
    }
}
