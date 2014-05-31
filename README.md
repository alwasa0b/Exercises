Exercises
=========

some interview exercises

Exercises1:
I used a simple java hashtable in my implementation to store key value pairs. Using the name as a key and value as value. If key in the hashtable increase the value otherwise add a new entry.

```
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
```

Exercises2:
I implemented this using java StringBuilder.class reverse() and String equals(). I was thinking about using a for loop and checking the front and the end of the string one at a time. Returning false whenever there isn't a match. I decided to go with this implementation because it looked cleaner and I don't know how much more/less efficient using the loop is going to be.

```
	public static boolean isPalindrome(String palindrome) {
		String strippedPalindrome = stripPalindrome(palindrome);
		
		if (strippedPalindrome.equals(reversePalindrome(strippedPalindrome))) return true;
		return false;
	}```
