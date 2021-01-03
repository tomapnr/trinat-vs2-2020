import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TipClient {
    public static void main(String[] args) {
        System.out.println("Client Started");
        new TipClient().start();

    }

    public void start() {
        try(Socket s = new Socket("localhost", 4242)) {
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            String advice = reader.readLine();
            System.out.println("Conseil: " + advice);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
