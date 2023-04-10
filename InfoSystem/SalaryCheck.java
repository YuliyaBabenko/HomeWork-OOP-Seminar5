package InfoSystem;

public class SalaryCheck {
    public static String compareSalary(Employee hum1, Employee hum2) {
        if (hum1.compareTo(hum2) > 0) {
            return hum1 + " зарабатывает больше " + hum2;
        } else if (hum1.compareTo(hum2) < 0) {
            return hum2 + " зарабатывает больше " + hum1;
        } else {
            return hum2 + " и " + hum1 + " зарабатывают одинаково.";
        }
    }
}
