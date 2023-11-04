abstract sealed class Person permits Employee,Manager {
    String name;
    String getName() {
        return getName();
    } ;
}

final class Employee extends Person {
    int id;
    private String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    int getEmpld() {
        return id;
    }
}

final class Manager extends extends Person {
    int id ;
    private String name;
    Manager (int id, String name){
        this.id = id;
        this.name = name;
    }
    int getManagerId(){
        return id;
    }
    public String getName() {
        return null;
    }
}

public class SealedDemo {
    public static void main(String args[]) {
        Manager p1 = new Manager(1001, "Rashmi");
        System.out.println("Name is : "+p1.getName());
        System.out.println("ID is : "+getId(p1));
    }
    public static int getId(Person person) {
        if(person instanceof Employee) {
            return ((Employee)person).getEmpld();           
        }else if(person instanceof Manager){
                return ((Manager)person).getManagerId();
        }else{
            return -1;
        }
    }
}