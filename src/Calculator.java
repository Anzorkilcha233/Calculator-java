import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
        
        int operator;
        int result;
        int number1;
        int number2;

        Scanner input = new Scanner(System.in);

        System.out.println("Добро пожаловать в консольный калькулятор!");
        System.out.println();

        while(true) {

            System.out.print("Введите первое число: "); number1 = input.nextInt();
            System.out.print("Введите второе число: "); number2 = input.nextInt();
            System.out.println();

            System.out.println("Выберите операцию:\n1. Сложение.\n2. Вычитание.\n3. Умножение.\n4. Деление.");
            System.out.println();

            System.out.print("Введите номер операции (1/2/3/4): "); operator = input.nextInt();
            System.out.println();

            if (operator == 1) {
                result = number1 + number2;
                System.out.println("Результат: "+number1+" "+"+"+" "+number2+" "+"="+" "+result);
            }
            else if (operator == 2) {
<<<<<<< HEAD
                result = number1 - number2;
                System.out.println("Результат: "+number1+" "+"-"+" "+number2+" "+"="+" "+result);
            }
            else if (operator == 3) {
                result = number1 * number2;
                System.out.println("Результат: "+number1+" "+"*"+" "+number2+" "+"="+" "+result);
            }
            else if (operator == 4) {
                result = number1 / number2;
=======
                result = number1 + number2;
                System.out.println("Результат: "+number1+" "+"-"+" "+number2+" "+"="+" "+result);
            }
            else if (operator == 3) {
                result = number1 + number2;
                System.out.println("Результат: "+number1+" "+"*"+" "+number2+" "+"="+" "+result);
            }
            else if (operator == 4) {
                result = number1 + number2;
>>>>>>> 677ee8c5d5fdd549d133b92c16b58c440b790abb
                System.out.println("Результат: "+number1+" "+"/"+" "+number2+" "+"="+" "+result);
            }
            else {
                System.out.println("Неверный формат!");
            }

            System.out.println();
            Scanner scan = new Scanner(System.in);
            System.out.print("Хотите выполнить еще одну операцию? (да/нет): "); String question = scan.nextLine();
<<<<<<< HEAD
            
            int num1 = question.length();
=======
            int num1 = question.length();

>>>>>>> 677ee8c5d5fdd549d133b92c16b58c440b790abb
            if(num1 == 3) {
                System.out.println();
                System.out.println("Спасибо за использование калькулятора!");
                break;
            }
            else {
                System.out.println();
            }
        }
    }
}