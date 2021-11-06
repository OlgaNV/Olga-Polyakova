package ru.geekbrains.lesson5;

public class lesson5 {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] =  new Employee ("Андрей Поздноров", "Директор", "ap@mail.ru", "+79993645544", 80000, 48);
        empCorp [ 1 ] = new Employee ("Елена Воробей", "Бухгалтер", "ev@mailru", "+79998876455", 60000, 50);
        empCorp [ 2 ] = new Employee ("Галина Третьяк", "Менеджер", "gt@mail.ru", "+79997285234", 40000, 32);
        empCorp [ 3 ] = new Employee ("Иван Клюев", "Кассир", "ik@mail.ru", "+79995553419", 35000, 26);
        empCorp [ 4 ] = new Employee ("Максим Гусев", "Охранник", "mg@mail.ru", "+79994400596", 25000, 45);

        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private final String name;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}