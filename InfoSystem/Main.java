package InfoSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Введите команду: "\n"
                            1. Добавить сотрудника "\n"
                            2. Удалить сотрудника "\n"
                            3. Редактировать сотрудника "\n"");

        

        System.out.println("Введите имя сотрудника")
                           
        Employer genManager = new Employer("John", "Simpson", "General Manager", 150000);
        Employee employee1 = new Employee("Katherine", "Bukovski", "Purchaser", 8000);
        Employee employee2 = new Employee("Jim", "Karter", "Logistician", 12000);
        Employee employee3 = new Employee("Jack", "Smith", "Accountant", 9000);
        Employee employee4 = new Employee("Pamela", "Blazic", "Finance Controller", 16000);

        Journal<Human> company = new Journal();
        company.addEmployee(genManager, "January");
        company.addEmployee(employee1, "February");
        company.addEmployee(employee2, "October");
        company.addEmployee(employee3, "December");
        company.addEmployee(employee4, "March");

        // доделать ввод с консоли
        // добавить интерфейсы взаимодействия
        // добавить сравнение
    }
}
