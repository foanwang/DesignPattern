package Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class TestServer implements Service{

	@Override
	public void doService(Socket client) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader reader = null;
        PrintStream writer = null;
        try {
            reader = new BufferedReader(
                         new InputStreamReader(client.getInputStream()));
            writer = new PrintStream(client.getOutputStream());
            String input = reader.readLine();
            writer.println(input);
        }
        finally {
            client.close();
        }
	}

    public static void main(String[] args) throws Exception {
        Server server = new Server(9999, new TestServer());
        server.start();
    }

}
