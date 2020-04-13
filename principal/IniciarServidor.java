package principal;

import classes.Produto;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class IniciarServidor {
    
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        try{
            System.out.println("Iniciando servidor");
            LocateRegistry.createRegistry(1099);
            
            Produto objetoProduto = new Produto();
            Naming.rebind("rmi://192.168.1.105/Produto", (Remote) objetoProduto);
        }
        catch(RemoteException re){
            System.out.print("Erro remoto: "+re.toString());
        }
    }
}
