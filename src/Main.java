import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static  Scanner  scanner= new Scanner(System.in);
    static void addition(){



        System.out.println("Type the first value: ");
        int a = scanner.nextInt();

        System.out.println("Type the second value: ");
        int b = scanner.nextInt();


        int result = a + b;
        System.out.println("The result of the addition is: "+ result);


    }
    static void subtraction(){

        System.out.println("Type the first value: ");
        int a = scanner.nextInt();

        System.out.println("Type the second value: ");
        int b = scanner.nextInt();

        int result = a - b;
        System.out.println("The result of the subtraction is: "+ result);
    }
    static void multiplication(){

        System.out.println("Type the first value: ");
        int a = scanner.nextInt();
        System.out.println("Type the second value: ");
        int b = scanner.nextInt();

        int result = a * b;
        System.out.println("The result of the multiplication is: "+ result);
    }
    static void division(){
        System.out.println("Type the first value: ");
        double a = scanner.nextDouble();

        System.out.println("Type the second value: ");
        double b = scanner.nextDouble();

        double result = a / b;
        System.out.println("The result of the division is: "+ result);

    }

    public static void main(String[] args) {


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
        scanner.close();
    }
}