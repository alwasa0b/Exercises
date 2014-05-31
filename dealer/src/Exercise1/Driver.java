package Exercise1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Map;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader file=null;
		try {
			file = new FileReader(args[0]);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Hashtable<String, Integer> names = new Counter(file).returnEntryList();

		for (Map.Entry<String,Integer> e : names.entrySet()) {  

			System.out.print("The total for "+ e.getKey() +" is " + e.getValue()+". ");
		}  
	}
}
