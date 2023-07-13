/**
 * Необхідно створити рядок із текстом (текст взяти будь-який з інтернету).
 * Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожен з нового рядка.
 * Завдання із зірочкою - якщо кількість символів не парна, доповнити символом по замовчуванню.
 * Символ любий на Ваш смак наприклад *☺︎☕︎⚓︎⚛︎
 * Маємо рядок - asdfg
 * Вивід:
 * asd
 * fg⚓︎
 */

public class Main {

    public static void main(String[] args) {
        String str = "1234567891111";
        char dChar = '⚓';
        if (str.length() % 2 != 0) {
            str += dChar;
        }
        int numberElementsOfDemiString = str.length() / 2;
        System.out.println(str.substring(0, numberElementsOfDemiString));
        System.out.println(str.substring(numberElementsOfDemiString));

    }
}
