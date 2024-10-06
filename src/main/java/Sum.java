public class Sum {

    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            try {
                // Преобразуем строку в число типа double
                double number = Double.parseDouble(arg);
                sum += number;
            } catch (NumberFormatException e) {
                // Если строка не является числом, считаем ее за 0
                System.out.println("Некорректное значение: " + arg + " (считается как 0)");
            }
        }

        // Выводим результат
        System.out.println("Сумма: " + sum);
    }
}
