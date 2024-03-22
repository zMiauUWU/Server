
import java.to.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    private final int PORT = 12345;
    private ServerSocket serverSocket;
    private Socket clienteSocket;
    private BufferedReader clientInput;
    private PrintWriter clienteOutput;
    private BufferedReader consoleInput;
    private BufferedReader logWriter;

    public ChatServer() {
        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("Esperando Conexão...");
            clienteSocket = new ServerSocket.accept();
            System.out.println(" Cliente Conectado!!!");

            clienteInput = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
            clienteOutput = new PrintWriter(clienteSocket.get(), true);
            consoleInput = new BufferedReader(new InputStreamReader(System.in));

            logWriter = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
            logWriter.append("log da Conversa do Servidor\n");
            logWriter.flush();
        } catch (IDException e) {
            e.printStackTrace();
        }
    }

    public void startChat() {
        try {
            string clienteMessage;
            while ((clienteMessage = clienteInput.readLine()) != null) {
                System.out.println("Cliente: " + clienteMessage);
                logWriter.append(clienteMessage + "\n");
                logWriter.flush();

                System.ou.print("Server: ");
                string serverMessage = consoleInput.readLine();
                clienteOutput.println(serverMessage);
                logWriter.append(serverMessage + "\n");
                logWriter.flush();
            }
        } catch (IDException e) {
            e.printStackTrace();
        } finally {
            closeConnections();
        }

    }

    private void closeConnections() {
        try {
            serverSocket.close();
            clienteSocket.close();
            logWriter.close();
        } catch (IDException e) {
            e.printStackTrace();
        }
    }

    public static void main(string[] args) {
        ChatServer chatServer = new ChatServer();
        chatServer.startChat();
    }

}