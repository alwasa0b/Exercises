package Exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class Counter {
	Hashtable<String, Integer> entries;
	BufferedReader inputFileBuffer;

	public Counter(FileReader inputFile) {
		// TODO Auto-generated constructor stub
		inputFileBuffer = new BufferedReader(inputFile);
	}


	private void spliter(){
		String line;
		try {
			while ((line = inputFileBuffer.readLine()) != null) {
				String[] entry = line.split(" ");
				if(entries.containsKey(entry[0])){
					entries.put(entry[0],entries.get(entry[0])+Integer.valueOf(entry[1]));
				}
				else{
					entries.put(entry[0],Integer.valueOf(entry[1]));
				}

				//System.out.println(entry[0]+" "+ entry[1]);

			}
		} catch (NumberFormatException e) {
			System.err.println("Please enter a name value pair e.g., 'John 15' ");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.err.println("Please make sure you don't any tailing empty spaces");

		} catch (IOException e) {

			e.printStackTrace();
		}
	}


	public Hashtable<String, Integer> returnEntryList() {
		entries= new Hashtable<String, Integer>();
		spliter();
		return entries;
	}

}
