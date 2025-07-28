public class Logger {
//private static variable to hold the single instance
    private static Logger instance;
    // Step 2: private constructor to prevent external object creation
    private Logger(){
        System.out.println("Logger initialized");
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("Log: " + message);
    }
}
