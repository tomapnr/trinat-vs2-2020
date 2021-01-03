
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TipServer {
    public static void main(String[] args) {
        System.out.println("Server Started");
        new TipServer().start();
    }



    public void start() {
        try(ServerSocket serverSock = new ServerSocket(4242)) {
            while(true) {
                Socket sock = serverSock.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String tip = getTip();
                writer.println(tip);
                writer.close();
                System.out.println(tip);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private String getTip() {
        return "Mefiez vous de l'eau qui dort";
    }

}
