
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

/**
 *
 * @author Samsung
 */
import java.rmi.RemoteException;


public class ServerInst
{

    public static void main(String[] args)
    {
        try
        {
            Calculadora msgObjeto = new Calculadora(); // Objeto da classe que possui a função print()
            Server server = new Server(msgObjeto, "127.0.0.1", "indo-alem");///Localhost
        }
        catch(IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch(InstantiationException e)
        {
            e.printStackTrace();
        }
        catch(RemoteException e)
        {
            e.printStackTrace();
        }
    }
}