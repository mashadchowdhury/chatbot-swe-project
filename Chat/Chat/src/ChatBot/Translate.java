package ChatBot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Translate {
    public static String translate(String src, String tar, String str) throws IOException { //making a method
    	
        String urlsrc = "https://script.google.com/macros/s/AKfycbyX3GupybClgLT1-3oMu0mSEvJdL0Emx9nCHTe0XwAgMypLDqcA/exec" + "?q=" + URLEncoder.encode(str, "UTF-8") + "&target=" + tar +"&source=" + src;
        URL url = new URL(urlsrc);//creating a new url
        StringBuilder resp = new StringBuilder(); // response
     // creating a connection
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        
        //setting up connection
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        //reading input
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            resp.append(inputLine);
        }
        in.close();
        return resp.toString();
    }

}