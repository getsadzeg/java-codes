
package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8080);
            Socket socket = server.accept();
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            while(true) {
                String text = dis.readUTF();
                dos.writeUTF(text + " is seen by server");
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
