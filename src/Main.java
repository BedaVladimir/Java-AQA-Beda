import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        calc(str);
    }

    public static String calc(String str) throws Exception {
        String[] arr = str.split(" ");
        // проверяем, что по длине строки это математическая операция.
        if (arr.length == 3) {
            int n1 = Integer.parseInt(arr[0]);
            String op = arr[1];
            int n2 = Integer.parseInt(arr[2]);
            // проверяем, что числа входят в диапазон от 1 до 10
            if ((1 <= n1  && n1 <= 10) && (1 <= n2 && n2 <= 10)) {
                switch (op) {
                    case "+": System.out.println(n1 + n2); break;
                    case "-": System.out.println(n1 - n2); break;
                    case "*": System.out.println(n1 * n2); break;
                    case "/": System.out.println(n1 / n2); break;
                }

            } else {
                throw new Exception("Одно из чисел не попадает в интервал от 1 до 10");
            }
        } else {
            throw new Exception("Введите строку в формате - два операнда и оператор(+,-,*,/). Например: 1 + 2");
        }
        return str;
    }
}

