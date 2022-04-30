import java.awt.*;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Point p1 = new Point(3,4);
        Point p2 = new Point(6,8);
        double distance = p1.distance(p2);
        System.out.println(p1.toString());
        System.out.println(distance);
        
        Rectangle frame = new Rectangle(100,100,500,500);
        frame.translate(50,100);
        frame.grow(10,20);
        System.out.println(frame);
        
        StringBuilder text1 = new StringBuilder("get");
        StringBuffer text2 = new StringBuffer();
        text1.append(" here");
        text1.delete(1,4);
        text1.insert(1,"o ");
        System.out.println(text1);
        
        // create a StringBuilder object,
        // default capacity will be 16
        StringBuilder str = new StringBuilder();
 
        // get default capacity
        int capacity = str.capacity();
 
        System.out.println("Default Capacity of StringBuilder = "
                           + capacity);
    }
}
