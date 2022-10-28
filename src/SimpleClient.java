import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {

    public static void main(String[] args) 	{
        try {
            Socket s = new Socket("127.0.0.1", 9999);
            InputStream i = s.getInputStream();
            OutputStream o = s.getOutputStream();
            String str;
            do {
                byte[] line = new byte[100];
                System.out.print("Digite uma expressão: ");
                System.in.read(line);
                o.write(line);
                i.read(line);
                str = new String(line);
                System.out.print("Resultado: ");
                System.out.println(str.trim().split(" ")[0]);
            } while ( !str.trim().equals("bye") );
            s.close();
        }
        catch (Exception err) {
            System.err.println(err);
        }
    }

}