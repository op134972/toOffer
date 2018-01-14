package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	private String host = "localhost";// 默认连接到本机  
    private int port = 8189;// 默认连接到端口8189  
  
    public ChatClient() {  
  
    }  
  
    // 连接到指定的主机和端口  
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
                    System.out.println("客户端：" + send);  
                    out.writeUTF("客户端：" + send);  
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
