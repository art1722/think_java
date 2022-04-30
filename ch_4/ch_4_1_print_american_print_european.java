// "static void main" must be defined in a public class.
/*
The purpose of this exercise is to take code from a previous exercise and redesign it as a method that takes parameters. Start with a working solution to Exercise 2-2.
1. Write a method called printAmerican that takes the day, date, month, and year as parameters and displays them in American format.
2. Test your method by invoking it from main and passing appropriate arguments. The output should look something like this (except the date might be different):
    Saturday, July 22, 2015
3. Once you have debugged printAmerican, write another method called printEur
opean that displays the date in European format.*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int hour = 11;
        int minute = 59;
        
        String day = "Monday";
        String date = "23";
        String month = "January";
        String year = "2021";
        
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");
        System.out.println(hour + minute + day + date + month + year + hour);
        
        printAmerican(day, date, month, year);
        System.out.println();
        printEuropean(day, date, month, year);
    }
    
    public static void printAmerican(String day, String date, String month, String year) {
        
        System.out.printf("%s, %s %s, %s", day, month, date, year);
    }
    public static void printEuropean(String day, String date, String month, String year) {
        System.out.printf("%s %s, %s, %s", month, date, day, year);
    }
}
