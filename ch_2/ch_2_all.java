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
        System.out.print(hour + minute + day + date + month + year + hour);
  
        System.out.println("Hello World!");
        
        int hour, minute, second;
        hour = 23;
        minute = 50;
        second = 46;
        
        double current_time = hour * 3600 + minute * 60 + second;
        double total_time = 86400;
        double remaining = total_time - current_time;
        System.out.println(remaining);
        
        double percentages = 100 - (remaining * 100 / total_time);
        System.out.print(percentages);
    }
    
}
