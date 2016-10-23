
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
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
		post.sendPost();
	}

	
	private void sendPost() throws Exception {

		
		String params = URLEncoder.encode("param1", "UTF-8") + "=" + URLEncoder.encode("value1", "UTF-8");
		params += "&" + URLEncoder.encode("param2", "UTF-8") + "=" + URLEncoder.encode("value2", "UTF-8");

		
		int port = 6969;
		
		InetAddress addr = InetAddress.getByName("192.168.1.13");
		Socket socket = new Socket(addr, port);
		String path = "/myapp";

		// Send headers
		BufferedWriter wr =
		new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF8"));
		wr.write("POST "+path+" HTTP/1.0rn");
		wr.write("Content-Length: "+params.length()+"rn");
		wr.write("Content-Type: application/x-www-form-urlencodedrn");
		wr.write("rn");

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

}
}
