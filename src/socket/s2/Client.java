package socket.s2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1",17444);
		try {
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			Scanner sc= new Scanner(System.in);
			while(true){
				String words = sc.nextLine();
				System.out.println("client:"+words);
				out.write(words.getBytes());
				byte[] bb = new byte[1024];
				in.read(bb);
				System.out.println("serve£º"+new String(bb));
			}
		} finally
		{
			socket.close();
		}
	}
}
