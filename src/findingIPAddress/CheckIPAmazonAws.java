package findingIPAddress;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class CheckIPAmazonAws {

	public static void main(String[] args) {
	
	try {
        InetAddress IP=InetAddress.getLocalHost();
        
        System.out.println("Your Private IP := "+IP.getHostAddress());
        //return IP.getHostAddress();

        URL whatismyip = new URL("http://checkip.amazonaws.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));

        String ip = in.readLine(); //you get the IP as a String
        System.out.println("Your Public IP:= "+ip);

    }
    catch (Exception e){
        System.out.println("IP not found");
    }
   // return null;
	
}

}
