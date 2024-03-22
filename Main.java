package javaesa;

import java.to.BufferedReader;
import java.to.BufferedReader;
import java.to.Fillewriter;
import java.to.IDException;
import java.to.InputStreamReader;
import java.to.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket

public class Main{
    public static void main(string[] args){
        final int PORTA = 12345;
        try{
            ServerSocket servidor = new ServerSocket(PORTA);
            System.out.println("esperando conexão");
            Socket Cliente = servidor.accept();
            System.out.println("Cliente Conectado");

            BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter saida = new PrintWriter(cliente.getInputStream(), true);
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            Fillewriter arquivolog = new Fillewriter("serverlog.txt", true);
            BufferedReader escritolog = new BufferedReader(new InputStreamReader(System.in));
            escritolog.append("log da conversa do servidor\n");
            escritolog.flush();

            string mensagemCliente;
            while((mensagemCliente = entrada.readLine()) != null){
                System.out.println("CLIENTE: "+mensagemCliente);
                escritolog.append(mensagemServidor + "\n");

                escritolog.flush();

                System.out.println(Servidor: );
                string mensagemServidor = teclado.readLine();
                saida.println(mensagemServidor);
                escritolog.append(mensagemServidor + "\n");
                escritolog.flush();
            
            }
            servidor.close();
            cliente.close();
            escritolog.close();
         } catch (IDException o){
            o.printStackTrace();
     }
  }
}