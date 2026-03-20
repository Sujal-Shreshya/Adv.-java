
public class FLOYDS_Tri {
    public static void floyds_triangle(int n) {
        // outer
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            // inner - how many times will counter be printed
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " "); // inner loop
                counter++;
            }
            System.out.println(); // next line
        }
    }

    public static void main(String[] args) {
        floyds_triangle(5);     // n = 4 or n = 5 k liye dry run kiya hai.
    }
}
