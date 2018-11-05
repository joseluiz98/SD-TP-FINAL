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
import static java.lang.Math.pow;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import static jdk.nashorn.internal.objects.NativeMath.sqrt;

public class Calculadora extends UnicastRemoteObject implements ICalculadora ///Defino a classe e esta deve obrigatoriamente implenta a interface
{
    protected Calculadora() throws RemoteException
    {
//        Apenas para lançar exceção vindo do remoto
    }

    public String print(String str) throws RemoteException
    {
//        Função a ser requerida pelo client
        System.out.println(str);
        return str;
    }
    public float soma (float valor1,float valor2){
        return valor1 + valor2;
    }
    public float multiplicacao (float valor1,float valor2){
        return valor1 * valor2;
    }
    public float subtracao (float valor1,float valor2){
        return valor1 - valor2;
    }
    public float divisao (float valor1,float valor2){
        return valor1 / valor2;
    }
    public float potencializacao (float valor1,float valor2){
        return (float) pow(valor1,valor2);
    }
    public double radiciacao(float valor1){
        return Math.sqrt(valor1);
    }
}