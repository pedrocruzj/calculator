import Calculator.*;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSocketServer {

    public static void main(String[] args) 	{
        try {
            ServerSocket s = new ServerSocket(9999);
            String str;
            while (true) {
                Socket c = s.accept();
                InputStream i = c.getInputStream();
                OutputStream o = c.getOutputStream();
                do {
                    byte[] line = new byte[100];
                    i.read(line);
                    str = new String(line);

                    Calculator calc = new Calculator(CalculatorArguments.getArgsFromExpression(str));
                    o.write(String.valueOf(calc.calculate()).getBytes());

                    str = new String(line);
                } while ( !str.trim().equals("bye") );
                c.close();
            }
        }
        catch (Exception err){
            System.err.println(err);
        }
    }

}