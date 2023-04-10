package InfoSystem;

import java.util.*;

public class Initialization {
    static Scanner scan = new Scanner(System.in);

    public static String getInitName(){
        System.out.println("Enter a name of the Employee");
        String name = scan.nextLine();
        return name;
    }

    public static String getInitSurname(){
        System.out.println("Enter a name of the Employee");
        String surname = scan.nextLine();
        return surname;
    }
    
    public static String getInitPos(){
        System.out.println("Enter a name of the Employee");
        String pos = scan.nextLine();
        return pos;
    }

    public static Integer getInitSal(){
        System.out.println("Enter a name of the Employee");
        Integer salary = scan.nextInt();
        return salary;
    }
    
}
