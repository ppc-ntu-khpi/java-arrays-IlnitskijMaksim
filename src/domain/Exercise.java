package domain;

public class Exercise {

    public static int Calculate(int count) {
        //Цикл працює у діапазоні від 1 до 999999
        for (int i = 1; i <= 999999; i++) {
            //Метод isLucky викликається з поточним значенням індексу циклу як аргументом
            //Коли метод повертає значення true, то змінна count збільшується
            if (isLucky(i)) {
                count++;
            }
        }
        //Повертає остаточне значення count
        return count;    
    }

    public static boolean isLucky(int n) {
        int sum1 = 0;
        int sum2 = 0;
        //Під час ітерації остання цифра вхідних даних n витягується та додається до sum1 або sum2
        for (int i = 1; i <= 6; i++) {
            int digit = n % 10;
            if (i <= 3) {
                sum1 += digit;
            } else {
                sum2 += digit;
            }
            
            n /= 10;
        }
        //Коротко назвев це повернення true
        //Коли сума перших трьох n дорівнює сумі останніх трьох n, то повертається значення true
        return sum1 == sum2;
    }
}
