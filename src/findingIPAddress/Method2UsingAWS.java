package findingIPAddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Method2UsingAWS {
	
	public static void main(String[] agrs) {
		
		try {
			System.out.println("Your Public IP: "+getIp());
		} catch (Exception e) {
			System.out.println("Ip not found");
		}
		
	}
	

	//method for getting public ip using "http://checkip.amazonaws.com"
	public static String getIp() throws Exception {
        URL whatismyip = new URL("http://checkip.amazonaws.com");
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(
                    whatismyip.openStream()));
            String ip = in.readLine();
            return ip;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	//end of getIp method
}

    

