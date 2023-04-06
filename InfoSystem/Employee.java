package InfoSystem;

public class Employee extends Human implements Work{

    public Employee(String name, String surname, String position, Integer salary) {
        super(name, surname, position, salary);
    }

    @Override
    public void work() {
        System.out.println("Работает");
    }

    @Override
    public void getDismissed() {
        System.out.println("Собирает вещи после увольнения");
    }

    @Override
    public void getPromotion() {
        System.out.println("Получает повышение");
    }

    @Override
    public void quitJob() {
        System.out.println("Увольняется");
    }

}