import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.PrintWriter;

public class ContestClient {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            try (
                    Socket socket2 = new Socket("united-portal.com", 9999);
                    /*InputStreamReader input = new InputStreamReader(socket.getInputStream());
                    BufferedReader reader = new BufferedReader(input)) {*/
                    PrintWriter writer = new PrintWriter(socket2.getOutputStream())) {

                /*String question = reader.readLine();*/
                writer.print("hello");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
