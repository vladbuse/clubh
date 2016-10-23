
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;
public class Connection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection post = new Connection();
		String[] p = {"p","u","l"};
		String[] t = {"p","u","l"};
		
		if (post.checkConnection())
			post.sendPost(p,t);
		
	}

	
	private void sendPost(String[] param, String[] value) throws Exception {

		String params = "";
		for ( int i=0;i<param.length;i++)
		{
			 params += URLEncoder.encode(param[i], "UTF-8") + "=" + URLEncoder.encode(value[i], "UTF-8") + "&";
		}
		params = params.substring(0, params.length()-1);
		
		int port = 6969;
		
		InetAddress addr = InetAddress.getByName("192.168.1.13");
		Socket socket = new Socket(addr, port);;

		// Send headers
		BufferedWriter wr =
		new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF8"));

		// Send parameters
		wr.write(params);
		wr.flush();

		// Get response
		BufferedReader rd = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line;
		
		while ((line = rd.readLine()) != null) {
		    System.out.println(line);
		}
		
		wr.close();
		rd.close();
		socket.close();

}
	
	private boolean checkConnection()
	{
		try
		{
			int port = 6969;
			InetAddress addr = InetAddress.getByName("192.168.1.13");
			Socket socket = new Socket(addr, port);
			boolean ans = socket.getInetAddress().isReachable(3);
			socket.close();
			return ans;
		}
		catch ( IOException e)
		{
			return false;
		}
		
	}
}
