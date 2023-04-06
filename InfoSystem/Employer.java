package InfoSystem;

public class Employer extends Human implements Manage{

    public Employer(String name, String surname, String position, Integer salary) {
        super(name, surname, position, salary);
    }

    @Override
    public void hireEmployee(Employee person) {
        System.out.println("Нанимает сотрудника");
    }

    @Override
    public void dismissEmployee(Employee person) {
        System.out.println("Увольняет сотрудника");
    }

    @Override
    public void promoteEmployee(Employee person) {
        System.out.println("Повышает сотрудника в должности");
    }

    @Override
    public void quitCompany() {
        System.out.println("Уходит из компании");
    }
    
}
