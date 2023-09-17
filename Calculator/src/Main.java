import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What operation you want? Type: Sum, Res, Multi, Div, Sqrt");
        String chosenOperation = input.nextLine(); //Declared variable por the operation selection
        String operatorInput = chosenOperation.toLowerCase();

        switch(operatorInput) { //Switch operator for call de method
            case "sum": sum();
            break;
            case "res": res();
            break;
            case "multi": multi();
            break;
            case "div": div();
            break;
            case "sqrt": sqrt();
            default: System.out.println("That is not a number");
        }

    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number");
        double firstNumber = Integer.parseInt(input.nextLine());

        System.out.println("Input the second number");
        double secondNumber = Integer.parseInt(input.nextLine());
        double result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
    }

    static void res(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number");
        double firstNumber = Integer.parseInt(input.nextLine());

        System.out.println("Input the second number");
        double secondNumber = Integer.parseInt(input.nextLine());
        double result = firstNumber - secondNumber;
        System.out.println("Result: " + result);
    }

    static void multi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number");
        double firstNumber = Integer.parseInt(input.nextLine());

        System.out.println("Input the second number");
        double secondNumber = Integer.parseInt(input.nextLine());
        double result = firstNumber * secondNumber;
        System.out.println("Result: " + result);
    }

    static void div(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number");
        double firstNumber = Integer.parseInt(input.nextLine());

        System.out.println("Input the second number");
        double secondNumber = Integer.parseInt(input.nextLine());
        double result = firstNumber / secondNumber;
        System.out.println("Result: " + result);
    }

    static void sqrt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number");
        double firstNumber = Integer.parseInt(input.nextLine());

        System.out.println(Math.sqrt(firstNumber));
    }

}
