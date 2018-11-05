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
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote {
//    Interface que fará a troca de mensagens entre cliente-servidor possível   

    float soma(float valor1, float valor2) throws RemoteException;
    float subtracao(float valor1, float valor2) throws RemoteException;
    float divisao(float valor1, float valor2) throws RemoteException;
    float potencializacao(float valor1, float valor2) throws RemoteException;
    double radiciacao(float valor1) throws RemoteException;
    float multiplicacao(float valor1, float valor2) throws RemoteException;
}
