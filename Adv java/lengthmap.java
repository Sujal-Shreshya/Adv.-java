import java.util.*;
import java.util.stream.Collectors;

public class lengthmap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "api");

        List<Integer> lengths = words.stream()
                                     .map(String::length)
                                     .collect(Collectors.toList());

        System.out.println(lengths);
    }
}
