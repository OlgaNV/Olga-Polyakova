package ru.geekbrains.lesson2;

public class lesson2 {
    public static void main(String[] args) {
        System.out.println("***********");
        if ( range(12, 17)) {
            System.out.println("true");
        } else {
            System.out.println("fales");
        }

        System.out.println(-8);

        System.out.println("***********");{
            System.out.println (isNegative (5));
                    }
        doTask4("Carlson is the worst book for children", 3);

            }
    //  1.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    //  от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        static boolean range(int one, int two) {
            int sum = one + two;
            return sum > 9 && sum < 21;
        }

//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
          static void printPositiveOrNegative(int num) {
                  String word = "Положительное";
                  if (num < 0) word = "Отрицательное";
          }

//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
// если число отрицательное, и вернуть false если положительное.
          static boolean isNegative(int num) {
                  return num < 0;
          }
//4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
// в консоль указанную строку, указанное количество раз
          public static void doTask4(String str, int n) {
                 for (int i = 1; i <= n; i++) {
                 System.out.println("[" + i + "]" + " " + str);
    }
}


}


