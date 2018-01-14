package socket.s2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Serve {
	public static void main(String[] args) throws IOException {
		ServerSocket serve = new ServerSocket(17444);
		Socket socket = serve.accept();
		try{
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			Scanner sc= new Scanner(System.in);
			while(true){
				byte[] bb = new byte[1024];
				in.read(bb);
				System.out.println("client£º"+new String(bb));
				String words = sc.nextLine();
				System.out.println("serve:"+words);
				out.write(words.getBytes());
			}
			
		}finally{
			socket.close();
		}
	}
}
