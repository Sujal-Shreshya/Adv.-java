package ESEpractice;
//create a star pattern in java?
public class star_pattern {
    public static void main(String[] args) {

        final int length = 5;

        for (int i = 1; i < length; i++) {

            // Print spaces first
            for (int j = length - 1; j > i; j--) {
                System.out.print(" ");
            }

            // Then print "*"
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}

// Source: https://stackoverflow.com/questions/42614746
