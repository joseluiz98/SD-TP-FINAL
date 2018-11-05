/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

/**
 * Servidor.
 * Contém o objeto que será acessado remotamente.
 * @author Samsung
 */
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server
{
    private int PORT = 40008;

    /**
     * Cria uma instância da classe Server.
     *
     * @param remote Objeto que será acessado remotamente.
     * @param ip     Endereço IP.
     */
    public Server(Remote remote, String ip, String name)
            throws IllegalAccessException, InstantiationException
    {
        init(remote, ip, name);
    }

    private void init(Remote remote, String ip, String name)
    {
        try
        {
//            Verifica se a porta está disponível para utilização
            Registry registry = LocateRegistry.createRegistry(PORT);
//            Cria a url no qual o cliente buscará o método remoto
            String uri = "rmi://" + ip + ":" + PORT + "/" + name; ///Montagem da url de acesso com o ip a porta e o nome da aba
            System.out.println(uri);
//            Inicializa o servidor com os dados instanciados acima
            Naming.rebind(uri, remote);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}