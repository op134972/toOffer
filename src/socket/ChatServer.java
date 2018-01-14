package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	private int port = 8189;// Ĭ�Ϸ������˿�  
	  
    public ChatServer() {  
    }  
  
    // ����ָ���˿ڵķ�����  
    public ChatServer(int port) {  
        this.port = port;  
    }  
  
    public void service() {  
        try {// ��������������  
            ServerSocket server = new ServerSocket(port);  
            Socket socket = server.accept();  
            try {  
                DataInputStream in = new DataInputStream(socket  
                        .getInputStream());  
                DataOutputStream out = new DataOutputStream(socket  
                        .getOutputStream());  
                Scanner scanner = new Scanner(System.in);  
                while (true) {  
                    String accpet = in.readUTF();  
                    System.out.println(accpet);  
                    String send = scanner.nextLine();  
                    System.out.println("��������" + send);  
                    out.writeUTF("��������" + send);  
                }  
            } finally {// ��������ʧ�ܵĻ�����ִ��socket.close();  
                socket.close();  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
  
    public static void main(String[] args) {  
        new ChatServer().service();  
    } 

}
