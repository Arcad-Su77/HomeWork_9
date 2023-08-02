import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №9");
        System.out.println("Массивы. Урок 2");
        int taskNumberRun;
        try {
            taskNumberRun = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Какое задание нужно выполнить? (1-10)"));
        } catch (Exception e) {
            taskNumberRun = 0;
            //e.printStackTrace(); // Выводит сообщение об ошибке
        }
        switch (taskNumberRun) {
            case 1 -> task1();    //Задание 1
            case 2 -> task2();    //Задание 2
            case 3 -> task3();    //Задание 3
            case 4 -> task4();    //Задание 4
//            case 5 -> task5();    //Задание 5
//            case 6 -> task6();    //Задание 6
//            case 7 -> task7();    //Задание 7
//            case 8 -> task8();    //Задание 8
//            case 9 -> task9();    //Задание 9
//            case 10 -> task10();    //Задание 10
//            case 11 -> task11();    // Задание 12
            default -> System.out.println("Вы не выбрали задание!?: " + taskNumberRun);
        }
        System.out.println("_________");
        System.out.println("Домашка закончилась. Всем спасибо, все свободны.");
    }

    private static void task4() {
        System.out.println("Задание 4");
        // Переыернуть массив
        // #00:25-00:35
        //Инициализация
        char temp;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < (reverseFullName.length/2); i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length-1-i] = temp;
        }
        System.out.println(reverseFullName);
    }

    private static void task3() {
        System.out.println("Задание 3");
        //выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        // #00:16-00:18
        //Инициализация
        int summa = 0;
        int[] ammounte = {1000, 2535, 355, 3356, 676, 744, 259, 5780, 5151, 7965, 5534, 438, 433, 476, 8005, 6876, 7686};
        int miniAmmount = ammounte[0];
        int maxAmmount = ammounte[0];
        for (int i : ammounte) {
            summa += i;
            if (miniAmmount > i) {
                miniAmmount = i;
            }
            if (maxAmmount < i) {
                maxAmmount = i;
            }
        }
        float middleAmount = (float) summa / 31;

        System.out.println("Сумма трат за месяц составила "+summa+" рублей");
        System.out.println("Минимальная сумма трат за день составила "+miniAmmount+" рубле");
        System.out.println("Максимальная сумма трат за день составила "+maxAmmount+" рублей");
        System.out.println("Средняя сумма трат за месяц составила "+middleAmount+" рублей");
    }

    private static void task2() {
        System.out.println("Задание 2");
        // Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        // Напишите программу, которая решит эту задачу, и выведите в консоль результат
        // в формате: «Минимальная сумма трат за день составила … рублей.
        // Максимальная сумма трат за день составила … рублей».
        // #00:00-00:08
        //Инициализация
        int[] ammounte = {1000,2535,355,3356,676,744,259,5780,5151,7965,5534,438,433,476,8005,6876,7686};
        int summa = 0;
        int miniAmmount = ammounte[0];
        int maxAmmount = ammounte[0];
        for (int i : ammounte) {
            summa += i;
            if (miniAmmount > i) {
                miniAmmount = i;
            }
            if (maxAmmount < i) {
                maxAmmount = i;
            }
        }
        System.out.println("Сумма трат за месяц составила "+summa+" рублей");
        System.out.println("Минимальная сумма трат за день составила "+miniAmmount+" рубле");
        System.out.println("Максимальная сумма трат за день составила "+maxAmmount+" рублей");
    }

    private static void task1() {
        System.out.println("Задание 1");
        // Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        // Напишите программу, которая решит эту задачу, и выведите в консоль
        // результат в формате: «Сумма трат за месяц составила … рублей».
        // #23:55-23:58
        //Инициализация
        int[] ammounte = {1000,2535,355,3356,676,744,259,5780,5151,7965,5534,438,433,476,8005,6876,7686};
        int summa = 0;
        for (int i : ammounte) {
            summa += i;
        }
        System.out.println("Сумма трат за месяц составила "+summa+" рублей");
    }
}