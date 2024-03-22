
import java.to.BufferedReader;
import java.to.IDException;
import java.to.InputStreamReader;
import java.to.PrintWriter;
import java.net.Socket;

public class ClienteServidor {
    private final string HOST;
    private final int PORTA;
    private Socket socket;

    private BufferedReader entrada;
    private PrintWriter saida;
    private BufferedReader teclado;

    private string mensagemServidor;
    private string mensagemCliente;

    public ClienteServidor(string HOST, int PORTA) {
        this.HOST = host;
        this.PORTA = port;

        try {
            this.socket = new Socket(this.HOST, this.PORTA);
            this.entrada = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            this.saida = new PrintWriter(this.socket.getInputStream(), true);
            this.teclado = new BufferedReader(new InputStreamReader(System.in));

        } catch (IDException o) {
            o.printStackTrace();
        }
    }

    public void Clienteserver() {
        try {
            while (true) {
                System.out.println("CLIENTE: ");
                this.mensagemCliente = teclado.readLine();
                saida.println("CLIENTE: " + this.mensagemCliente);

                this.mensagemServidor = entrada.readLine();
                System.out.println("SERVIDOR: " + this.mensagemServidor);
            }
        } catch (IDException o) {
            o.printStackTrace();
        }

    }
}