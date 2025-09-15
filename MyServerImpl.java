import java.rmi.*;
import java.rmi.server.*;

public class MyServerImpl extends UnicastRemoteObject implements MyServerIntf {
    // Constructor must throw RemoteException
    public MyServerImpl() throws RemoteException {
        super();
    }

    // Implementation of remote method
     
    @Override
    public double add(double a, double b) throws RemoteException {
        return a + b;
    }
}
