import java.util.HashSet;

public class LongestSubString {
    public static int subString(String input){

    	/* Invalid Input testing */
    	if (input.contains(" "))
    	{
    		return 0; //Zero Length if it is empty string or contains space.
    	}
    		
    	String LongestStr = "";
        String DiscoveredLongest = "";
        HashSet<Character> set = new HashSet<Character>(); //for no repetition in character set

        

        for (int i = 0; i < input.length(); i++) 
        {
            char c = input.charAt(i); //Charactered Appered in scanning of string

            if (set.contains(c)) //if character already in scanned character set
            {
            	DiscoveredLongest = ""; //discard probable longest string
                set.clear();			//Refresh Stored Character set
            }
            DiscoveredLongest += c;    //Otherwise concatenate appeared character in substring
            set.add(c);					//add character in set
            
            if (DiscoveredLongest.length() > LongestStr.length()) //if we found longer string than previous one
            {
                LongestStr = DiscoveredLongest; //update longest string
            }
        }

        return (LongestStr.length()); //return longest string length
    }

    
}