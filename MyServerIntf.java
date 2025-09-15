import java.rmi.*;

public interface MyServerIntf extends Remote {
    double add(double a, double b) throws RemoteException;
}
