package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	private String host = "localhost";// Ĭ�����ӵ�����  
    private int port = 8189;// Ĭ�����ӵ��˿�8189  
  
    public ChatClient() {  
  
    }  
  
    // ���ӵ�ָ���������Ͷ˿�  
    public ChatClient(String host, int port) {  
        this.host = host;  
        this.port = port;  
    }  
  
    public void chat() {  
        try {  
            Socket socket = new Socket(host, port);  
            try {  
                DataInputStream in = new DataInputStream(socket  
                        .getInputStream());  
                DataOutputStream out = new DataOutputStream(socket  
                        .getOutputStream());  
                Scanner scanner = new Scanner(System.in);  
                while (true) {  
                    String send = scanner.nextLine();  
                    System.out.println("�ͻ��ˣ�" + send);  
                    out.writeUTF("�ͻ��ˣ�" + send);  
                    String accpet = in.readUTF();  
                    System.out.println(accpet);  
                }  
  
            } finally {  
                socket.close();  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
  
    public static void main(String[] args) {  
        new ChatClient().chat();  
    }  
}
