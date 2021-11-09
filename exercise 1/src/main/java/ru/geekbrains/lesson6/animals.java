package ru.geekbrains.lesson6;


public abstract class animals {

    //1. Создать классы Собака и Кот с наследованием от класса Животное.
    //2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    // Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150);
    // -> 'Бобик пробежал 150 м.');
    //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
    // кот не умеет плавать, собака 10 м.).


    private int runMaxDistance;
    private int swimMaxDistance;
    private float jumpMaxDistance;

    public animals(int runDistance, int swimDistance, float jumpHeight) {
    }


    public void Animal(int runMaxDistance, int swimMaxDistance, float jumpMaxDistance) {

        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxDistance = jumpMaxDistance;
    }


    public void run(int runDistance) {
        System.out.println("run: " + (runDistance <= runMaxDistance));
    }

    public void swim(int swimDistance) {
        System.out.println("swim: " + (swimDistance <= swimMaxDistance));
    }

    public void jump(float jumpHeight) {
        System.out.println("jump: " + (jumpHeight <= jumpMaxDistance));
    }
}
