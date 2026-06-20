public class Main {

    public static void main(String[] args) {

        EmployeeLogger logger1 = EmployeeLogger.getInstance();
        logger1.log("Application started.");

        EmployeeLogger logger2 = EmployeeLogger.getInstance();
        logger2.log("User logged in.");

        EmployeeLogger logger3 = EmployeeLogger.getInstance();
        logger3.log("Application closed.");

        System.out.println("\nChecking instances:");

        System.out.println("logger1 hashcode: " + logger1.hashCode());
        System.out.println("logger2 hashcode: " + logger2.hashCode());
        System.out.println("logger3 hashcode: " + logger3.hashCode());

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("\nSingleton pattern implemented successfully.");
        } else {
            System.out.println("\nMultiple instances created.");
        }
    }
}