import java.util.*;
import java.util.stream.*;

public class listmap {
     public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        List<Integer> doubledList = numbers.stream()
                                           .map(n -> n * 2)
                                           .collect(Collectors.toList());

        System.out.println(doubledList);
    }
}
