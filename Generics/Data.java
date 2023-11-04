@FunctionalInterface
public interface Data {
    private void call() {
        System.out.println("Hello I am in JT.");
    }

    static void show(){
        System.out.println("This is a Class Method");
    }

    default void display(){
        call();
        System.out.println("I am Rashmi");
    }

    void showMessage(String message);

}

