package InfoSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Employer genManager = new Employer("John", "Simpson", "General Manager", 150000);
        Journal<Human> company = new Journal();

        company.addEmployee(genManager, "January");

        Employee employee1 = new Employee("Katherine", "Bukovski", "Purchaser", 8000);
        Employee employee2 = new Employee("Jim", "Karter", "Logistician", 12000);
        Employee employee3 = new Employee("Jack", "Smith", "Accountant", 9000);
        Employee employee4 = new Employee("Pamela", "Blazic", "Finance Controller", 16000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду: 1. Добавить сотрудника 2. Удалить сотрудника 3. Редактировать сотрудника");

        Integer in = scanner.nextInt();

        if (in == 1) {
            genManager.hireEmployee(employee1);
            company.addEmployee(employee1, "April");
            employee1.work();
        } else if (in == 2) {
            genManager.dismissEmployee(employee2);
            company.removeEmployee(employee2);
            employee2.getDismissed();
        } else if (in == 3) {
            genManager.promoteEmployee(employee3);
            employee3.getPromotion();
        } else {
            System.out.println("No action available");
        }
        
        // добавить сравнение
    }
}
