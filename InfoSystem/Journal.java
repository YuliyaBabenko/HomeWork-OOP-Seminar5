package InfoSystem;

import java.util.*;

public class Journal<T extends Human> {
    private List<T> company;

    public Journal() {
        company = new ArrayList<>();
    }

    public boolean addEmployee(Human human, String month) {
        boolean flag = false;
        if (!company.contains(human)) {
            company.add(human);
            flag = true;
        }
        return flag;
    }

    public Journal<T> getEmployee(int index) {
        return contains(index) ? company.get(index) : null;
    }

    private boolean contains(int index) {
        return company != null
                && company.size() > index;
    }

    public int count() {
        return company.size();
    }

    public List<T> getCompany() {
        return company;
    }

    public boolean removeEmployee(Human human) {
        boolean flag = false;
        if (!company.contains(human)) {
            company.remove(human);
            flag = true;
        }
        return flag;
    }

}
