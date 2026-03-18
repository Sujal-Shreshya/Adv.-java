import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class uppercaseMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("darwin", "java", "stream");

        List<String> upperList = names.stream()
                                      .map(String::toUpperCase)
                                      .collect(Collectors.toList());

        System.out.println(upperList);
    }
}
