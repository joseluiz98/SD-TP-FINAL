/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Cliente.
 * Responsável por acessar um objeto remotamente por meio de um ip e um nome.
 * @param <T> Tipo do objeto a ser acessado. 
 * @author Samsung
 */
public class Client<T extends Remote>
{
    private int PORT = 40008; // Porta a ser utilizada para conexão (tem que ser igual no cliente e no server)
    private final T remote;

    /**
     * Cria uma instância da classe Client.
     *
     * @param ip   Endereço IP do local onde se quer acessar o objeto.
     * @param name Nome do objeto a ser acessado.
     */
    public Client(String ip, String name)
            throws RemoteException, NotBoundException, MalformedURLException
    {
        //Acessa um objeto remotamente através do ip do local onde está o objeto e seu nome.
        remote = (T)Naming.lookup("rmi://" + ip + ":" + PORT + "/" + name);
    }

    /**
     * Obtém o objeto remoto.
     */
    public T getRemoteObj()
    {
        return remote;
    }
    
}