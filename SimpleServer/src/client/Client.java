package client;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[]args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1",8000);

        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());

        writer.write("90\r\n");
        writer.flush();

        System.out.println(reader.readLine()); // just get the msg...

        JOptionPane.showMessageDialog(null,"You got a response: \r\n" + reader.readLine() + "\r\n" + reader.readLine());

        writer.close();
        reader.close();
        clientSocket.close();

    }
}
