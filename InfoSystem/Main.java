package InfoSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Employer genManager = new Employer(Initialization.getInitName(), Initialization.getInitSurname(), Initialization.getInitPos(), Initialization.getInitSal());
        Journal<Human> company = new Journal();

        company.addEmployee(genManager, "January");
        
        System.out.println("Введите команду: 1. Добавить сотрудника 2. Удалить сотрудника 3. Редактировать сотрудника 4. Сравнить оклады сотрудников 5. Вывести список сотрудников");

        Integer in = scanner.nextInt();

        if (in == 1) {
            Employee employee = new Employee(Initialization.getInitName(), Initialization.getInitSurname(), Initialization.getInitPos(), Initialization.getInitSal());
            genManager.hireEmployee(employee);
            company.addEmployee(employee, "April");
            employee.work();
        } else if (in == 2) {
            Employee employee = company.getEmployee();
            genManager.dismissEmployee(employee);
            company.removeEmployee(employee);
            employee.getDismissed();
        } else if (in == 3) {
            Employee employee = company.getEmployee();
            genManager.promoteEmployee(employee);
            employee.getPromotion();
        } else if (in == 4) {
            Employee employee1 = company.getEmployee();
            Employee employee2 = company.getEmployee();
            System.out.println(SalaryCheck.compareSalary(employee1, employee2));
        } else if (in == 5) {
            System.out.print(company.toString());
        } else {
            System.out.println("No action available");
        }
        
        genManager.initiateParty();
    }
}
