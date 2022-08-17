import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                System.out.println("Input number x");
                int x = scan.nextInt();
                System.out.println("Input number y");
                int y = scan.nextInt();
                System.out.println("Chose (+;-;*;/;)");

                String Equasion = scan.next();

        switch (Equasion) {
            case "+" -> System.out.println("Rezult is" + add(x, y));
            case "-" -> System.out.println("Rezult is" + sub(x, y));
            case "*" -> System.out.println("Rezult is" + mlt(x, y));
            case "/" -> System.out.println("Rezult is" + div(x, y));
        }
    }

public static int add(int x,int y){
    return x + y;
}
    public static int sub(int x,int y) {
        return x - y;
    }
    public static int mlt(int x,int y) {
        return x * y;
    }
    public static int div(int x,int y) {
        return x / y;
    }
}
