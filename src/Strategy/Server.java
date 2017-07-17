package Strategy;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket server;
    private Service service;
    
    Server(int port, Service service) throws IOException {
        this.server = new ServerSocket(port);
        this.service = service;
    }
    
    void start() throws IOException {
        while(true) {
            Socket client = server.accept();
            service.doService(client);
        }
    }
}
