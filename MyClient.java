import java.net.MalformedURLException;
import java.rmi.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            // args[0] should be hostname (e.g., localhost)
            String sName = "rmi://" + args[0] + "/RMServer";

            // Lookup remote object
            MyServerIntf asif = (MyServerIntf) Naming.lookup(sName);

            double d1 = 2000, d2 = 500;
            System.out.println("Addition: " + asif.add(d1, d2));
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.out.println("Exception: " + e);
        }
    }
}
