public class EmployeeLogger {

    // Step 1: Create a private static instance variable
    private static EmployeeLogger instance;

    // Step 2: Make the constructor private
    private EmployeeLogger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Provide a public method to access the instance
    public static EmployeeLogger getInstance() {

        if (instance == null) {
            instance = new EmployeeLogger();
        }

        return instance;
    }

    // Business method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}