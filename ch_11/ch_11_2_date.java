/*
Write a class definition for Date, an object type that contains three integers: year,
month, and day. This class should provide two constructors. The first should take no
parameters and initialize a default date. The second should take parameters named
year, month and day, and use them to initialize the instance variables.
Write a main method that creates a new Date object named birthday. The new object
should contain your birth date. You can use either constructor.
*/
import java.time.*;
//import java.util.Date;
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //String output = myLocalDate.toString();
        Date temp = new Date();
        System.out.println(temp);
        Date birthday = new Date(12,12,2121);
        System.out.println(birthday);
    }
    
    public static class Date {
        private int year;
        private int month;
        private int date;
        
        public Date() {
            LocalDateTime cur = LocalDateTime.now();
            year = cur.getDayOfMonth();
            month = cur.getMonthValue();
            date = cur.getYear();
        }
        
        public Date(int year, int month, int date) {
            this.year = year;
            this.month = month;
            this.date = date;
        }
        
        public String toString() {
            return String.format("%d, %d, %d", this.year, this.month, this.date);
        }
    }
}
