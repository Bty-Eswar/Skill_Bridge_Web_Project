import java.rmi.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            MyServerImpl asi = new MyServerImpl();
            Naming.rebind("RMServer", asi);  // Bind remote object with name
            System.out.println("Server Started...");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
