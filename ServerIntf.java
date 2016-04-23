package stockbroker9;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerIntf extends Remote {
    String getCommRate() throws RemoteException;
}
