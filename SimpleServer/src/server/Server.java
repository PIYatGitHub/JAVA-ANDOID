package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;

public class Server {
    public static void main(String[]args) {
        int guessMe = (int)(Math.random()*100),
            is_it = 0;
        System.out.println(guessMe + "<<<<<<<<<<HINT>>>>>>>>>>>>");
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("connecting to port 8000");
            while (true){
                Socket clientSocket = serverSocket.accept();
                String response;
                OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                is_it = Integer.parseInt(reader.readLine());
                if(is_it==guessMe || (is_it>=guessMe && is_it<=guessMe*1.15)) {
                    response = "HTTP/1.0 200 OK \r\n" +
                            "Content-type: text/html \r\n" +
                            "You are within the set tolerance of 15%! the number was:" + guessMe+ "\r\n";
                } else {
                    response = "HTTP/1.0 200 OK \r\n" +
                            "Content-type: text/html \r\n" +
                            "You are off. Try again!\r\n";
                }

                writer.write(response);
                writer.flush(); // important - otherwise it does not send!!!!

                reader.close();
                writer.close();
                clientSocket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
