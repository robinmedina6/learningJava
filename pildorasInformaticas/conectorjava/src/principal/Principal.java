package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Principal {
	private static URL url;
	private static HttpURLConnection http;

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://jer.matrixtech.com.co/sigaadmin/index.jsp");
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestMethod("POST");
		http.setDoOutput(true);
		http.setRequestProperty("Connection", "keep-alive");
		http.setRequestProperty("Cache-Control", "max-age=0");
		//http.setRequestProperty("sec-ch-ua", \"\" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91"");
		http.setRequestProperty("sec-ch-ua-mobile", "?0");
		http.setRequestProperty("Upgrade-Insecure-Requests", "1");
		http.setRequestProperty("Origin", "https://jer.matrixtech.com.co");
		http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		http.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
		http.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		http.setRequestProperty("Sec-Fetch-Site", "same-origin");
		http.setRequestProperty("Sec-Fetch-Mode", "navigate");
		http.setRequestProperty("Sec-Fetch-User", "?1");
		http.setRequestProperty("Sec-Fetch-Dest", "document");
		http.setRequestProperty("Referer", "https://jer.matrixtech.com.co/sigaadmin/jsp/login.jsp");
		http.setRequestProperty("Accept-Language", "es-CO,es-419;q=0.9,es;q=0.8,en;q=0.7");
		http.setRequestProperty("Cookie", "JSESSIONID=\"bEQ6S__s_8P2d-jga-VU38thHIQORW2sbwioigok.Alaska.grupomatrix.local:SIGA_Boyaca_Server\"; _ga=GA1.1.747070911.1624585419; suredapp._km_id=65fqxkTOM7DQhZF71oLDzsKTMV1pLL35; suredapp._km_user_name=; _ga_WH1WDKNY3T=GS1.1.1624673361.2.0.1624673361.0; cookiesession1=678B293BYZABCDEFGHIJKLNOPQRS2184; SIGA=996610476.39455.0000");

		String data = "login=1056803989&password=1996042021&nombreEquipo=&macEquipo=&soEquipo=&ramEquipo=&versionJava=&navegador=&idEquipo=&diaLogin=22&minutoLogin=26";

		byte[] out = data.getBytes(StandardCharsets.UTF_8);

		OutputStream stream = http.getOutputStream();
		stream.write(out);

		System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
		//http.disconnect();


		
		
		
		
		StringBuilder resultado= new StringBuilder();; 
		BufferedReader rd = new BufferedReader(new InputStreamReader(http.getInputStream()));
		  String linea;
		  // Mientras el BufferedReader se pueda leer, agregar contenido a resultado
		  while ((linea = rd.readLine()) != null) {
		    resultado.append(linea+"\n");
		  }
		  // Cerrar el BufferedReader
		  rd.close();
		  // Regresar resultado, pero como cadena, no como StringBuilder
		  System.out.println(resultado.toString());
		  http.disconnect();
	}
}
