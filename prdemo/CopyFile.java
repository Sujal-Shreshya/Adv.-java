import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile{
public static void main(String []args) {
try{
FileInputStream fis = new FileInputStream("source.jpg");
FileOutputStream fos = new FileOutputStream("source_copy.jpg");
int i;
while ((i = fis.read()) != -1) {
fos.write(i);
}
fis.close();
fos.close();
System.out.println("File copied successfully!");
} catch (IOException e) {
System.out.println("Error: " + e.getMessage());
}
}
}
