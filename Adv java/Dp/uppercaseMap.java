package Dp;
import java.util.*;
import java.util.stream.*;

public class uppercaseMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("darwin", "java", "stream");

        List<String> upperList = names.stream()
                                      .map(String::toUpperCase)
                                      .collect(Collectors.toList());

        System.out.println(upperList);
    }
}
