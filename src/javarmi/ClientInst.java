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
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientInst
{
    public static void main(String[] args)
    {
        try
        {
            Client<ICalculadora> client = new Client<>("127.0.0.1", "indo-alem"); /// Instancio um objeto da classe Client
            
            System.out.println(client.getRemoteObj().soma(2, 2)); // Dou um get na conexão com o remoto e procuro pelo método print
            System.out.println(client.getRemoteObj().subtracao(3, 2));
            System.out.println(client.getRemoteObj().divisao(3, 2));
            System.out.println(client.getRemoteObj().multiplicacao(3, 2));
            System.out.println(client.getRemoteObj().radiciacao(2));
            System.out.println(client.getRemoteObj().potencializacao(3, 2));
        }
        catch(RemoteException e)
        {
            e.printStackTrace();
        }
        catch(NotBoundException e)
        {
            e.printStackTrace();
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}