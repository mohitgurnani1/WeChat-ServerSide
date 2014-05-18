import java.net.*;
	import java.io.*;

	class ServerSide
	{
private static InputStreamReader inputStreamReader;
	private static BufferedReader bufferedReader;
	private static String message;

			
public static void main(String args[])throws IOException
		{
			ServerSocket ss=new ServerSocket(5578);
			while(true){
				Socket client=ss.accept();
		
				inputStreamReader = new InputStreamReader(client.getInputStream());
				bufferedReader = new BufferedReader(inputStreamReader); // get the client message
				message = bufferedReader.readLine();

				System.out.println(message);
				inputStreamReader.close();
				client.close();

			}
				
		}
	}

