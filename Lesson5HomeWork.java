/**
 * Java 1. HomeWork 5
 *
 @ autor Shchukina Olga
 @ version 19.11.2021
*/

class Lesson5HomeWork {
    
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
            empArray[0] = new Employee("Sidorov Ivan", "Manager", "sidor@mail.ru", "89204483223", 35000, 26);
            empArray[1] = new Employee("Petrov Andrey", "Engineer", "petr@yandex.ru", "89205564323", 40000, 41);
            empArray[2] = new Employee("Ivanova Svetlana", "Coach manager", "svet@gmail.com", "89503352552", 65000, 32);
            empArray[3] = new Employee("Safonova Elena", "Accountant", "safon@mail.ru", "89205556273", 35000, 45);
            empArray[4] = new Employee("Osipov Anton", "Consultant", "antony@yandex.ru", "89302270907", 25000, 21);
    for (Employee employee : empArray)
            if (employee.getAge()>40)
            System.out.println(employee);
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

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
    public String toString() {
        return (name+ "\n-"
                + position+ "\n-"
                + email+ "\n-"
                + phone+ "\n-"
                + salary+ "\n-"
                + age);
    }
}