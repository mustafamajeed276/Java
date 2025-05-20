import java.util.Scanner;;

public class application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("enter 2 numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(x + " / "+ y + " = " + z);
        }
        catch (ArithmeticException ex) {
            System.out.println("---- final block ----");
            System.out.println(ex.toString());
        }
        finally {
            System.out.println("---- final block ----");
            System.out.println("Application designed and developed by");
            System.out.println("Shayan");
            sc.close();
        }
        System.out.println("--- DONE ---");
    }
}
