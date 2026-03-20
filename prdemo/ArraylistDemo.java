import java.util.*;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        System.out.println("List: " + list);
        System.out.println("Element at index 1: " + list.get(1));
        }
    }
