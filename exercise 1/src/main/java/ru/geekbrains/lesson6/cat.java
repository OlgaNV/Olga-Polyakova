package ru.geekbrains.lesson6;

    //1. Создать классы Собака и Кот с наследованием от класса Животное.
    //2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    // Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150);
    // -> 'Бобик пробежал 150 м.');
    //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
    // кот не умеет плавать, собака 10 м.).

public class cat {

   public static class cat extends animals { // Не пойму что не так?
       private int runMaxDistance;
       private int swimMaxDistance;
       private float jumpMaxDistance;
            public cat(int runDistance, int swimDistance, float jumpHeight) {
            super(runDistance, swimDistance, jumpHeight);
        }
   }
          
}
