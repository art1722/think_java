// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        double input;
        
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        int hours = (int) (input / 3600);
        int minutes = (int) ((input % 3600) / 60);
        int seconds = (int) ((input % 3600) % 60);
        
        System.out.printf("hours: %d, minutes: %d, seconds = %d", hours, minutes, seconds);
        System.out.println();
    }
}
