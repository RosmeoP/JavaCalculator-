import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void addition(){

        Scanner  scanner= new Scanner(System.in);

        System.out.println("Type the first value: ");
        int a = scanner.nextInt();

        System.out.println("Type the second value: ");
        int b = scanner.nextInt();


        int result = a + b;
        System.out.println("The result of the addition is: "+ result);

        scanner.close();

    }
    static void subtraction(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first value: ");
        int a = scanner.nextInt();

        System.out.println("Type the second value: ");
        int b = scanner.nextInt();

        int result = a - b;
        System.out.println("The result of the subtraction is: "+ result);
        scanner.close();
    }
    static void multiplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first value: ");
        int a = scanner.nextInt();
        System.out.println("Type the second value: ");
        int b = scanner.nextInt();

        int result = a * b;
        System.out.println("The result of the multiplication is: "+ result);
        scanner.close();
    }
    static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first value: ");
        double a = scanner.nextDouble();

        System.out.println("Type the second value: ");
        double b = scanner.nextDouble();

        double result = a / b;
        System.out.println("The result of the division is: "+ result);
        scanner.close();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option to do a 1 for addition, 2 for subtraction and 3 for multiplication, 4 for division: ");
        int value = scanner.nextInt();


        switch(value){
            case 1:
                addition();
                break;
                case 2:
                    subtraction();
                    break;
                    case 3:
                        multiplication();
                        break;
                        case 4:
                            division();
                            break;

        }
    }
}