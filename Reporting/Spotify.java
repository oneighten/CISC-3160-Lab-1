import java.io.*;
import java.util.*;
public class Spotify {
	//example from 
	//https://www.tutorialspoint.com/how-to-read-the-data-from-a-csv-file-in-java
	public static final String delimiter = ",";
	public static void main(String[] args) throws IOException {
		File file = new File("regional-us-daily-latest.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
    
		LinkedList<String> streamList = new LinkedList<String>();
		LinkedList<String> artistList = new LinkedList<String>();
    
		String line ="";
		String[] tempArr;
    
		while ((line = br.readLine()) != null) {
			tempArr = line.split(delimiter);
      
			//data[0] = position, data[3] = streams, data[4] = url;
      
			String stream = tempArr[3];
			streamList.add(stream);
      
			String artist = tempArr[2];
			artistList.add(artist);
		}
		br.close();
		System.out.println("Artists\t\t\tStreams\n");
		
		for(int i = 2; i < 12; i++)
		{
			//Print Top 10 Artists and their streams
			System.out.format("%-30s %s", artistList.get(i), streamList.get(i));
			System.out.println("\n");

		}	
	}
	}
