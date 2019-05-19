import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class BilateralBind {
    private String port;
    private String ip;
    private ServerSocket server;
    private Socket client;
    private BufferedReader reader;
    private BufferedWriter writer;

    BilateralBind(String port){
        this.port = port;
        try {
            server = new ServerSocket(Integer.parseInt(port));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    BilateralBind(BilateralBind bindServer){
        server = bindServer.server;
        accept();
    }

    BilateralBind(String port, String ip) {
        this.port = port;
        this.ip = ip;
        try {
            client = new Socket(this.port, Integer.parseInt(this.ip));
            createStreams();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void accept() {
        try {
            client = server.accept();
            createStreams();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createStreams (){
        try {
            reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String readLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  "";
    }

    void writeLine(String msg) {
        try {
            writer.write(msg);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void close() {
        try {
            reader.close();
            writer.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}