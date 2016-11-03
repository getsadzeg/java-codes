
package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            String text = null;
            String ans = null;
            while(true) {
                text = scanner.nextLine();
                dos.writeUTF(text);
                ans = dis.readUTF();
                System.out.println(ans);
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
