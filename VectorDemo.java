import java.util.Vector;

public class VectorDemo{
	public static void main(String[] args){
	Vector<Integer> v = new Vector<>();
v.add(100);
v.add(200);
v.add(300);
System.out.println("Vector: " + v);
System.out.println("Size: " + v.size());
System.out.println("Capacity: " + v.capacity());

v.addElement(500);
System.out.println("Vector: " + v);
System.out.println("First Element: " + v.firstElement());
System.out.println("Last Element: " + v.lastElement());

v.remove(100);
System.out.println("After Removal: " + v);

v.trimToSize();
System.out.println("Capacity after Trim:" + v.capacity());
v.addElement(400);
System.out.println("Vector"+ v);
}
}


 