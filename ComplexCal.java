import java.util.Scanner;

class ComplexCal {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a numerc value");
        number1 = input.nextDouble();

        System.out.println("Enter a numerc value");
        number2 = input.nextDouble();
        
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.print("Answer is : ");
        switch (operator) {

            
            case '+':
                result = number1 + number2;
                System.out.println(result);
                break;

            
            case '-':
                result = number1 - number2;
                System.out.println(result);
                break;

            
            case '*':
                result = number1 * number2;
                System.out.println(result);
                break;

            
            case '/':
                result = number1 / number2;
                System.out.println(result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}