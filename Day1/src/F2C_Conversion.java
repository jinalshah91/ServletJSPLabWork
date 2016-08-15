import java.util.Scanner;

public class F2C_Conversion {

    private static Scanner sc;

	public static void main(String[] args) {
        try {
            System.out.println("Please enter the temperature in fahrenheit\n");
            sc = new Scanner(System.in);
            String input = sc.nextLine();
            double ftemp = Double.valueOf(input);
            double ctemp = 0;
            ctemp = 5 * (ftemp - 32.0) / 9.0;
            System.out.println("Celsius temperature is " + ctemp);
        }
        catch (Exception e){
            System.out.println("Error in performing conversion\n"+e.getMessage());
        }
    }
}
