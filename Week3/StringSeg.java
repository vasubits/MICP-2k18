import java.util.HashSet;
import java.util.Set;

public class StringSeg {

	public static boolean breakable(String line, Set<String> Dictionary) {
		
		if(Dictionary==null && (line==null || line=="")) 
		{
			return true;
		}
		if(Dictionary==null)
		{
			return false;
			
		}	
		if(line==null || Dictionary.isEmpty())
		{
			return false;
		}
		
		if(line.equals(""))//nothing to search
		{	
			return true;
		}	
		
	    int[] traverse = new int[line.length()+1]; //traverse entire string with one step ahead
	    
	    for(int i=0;i<traverse.length;i++)
	    {
	    	traverse[i]=-1;							//all are unvisited.
	    }
	 
	    traverse[0]=0;
	     
	    for(int i=0; i<line.length(); i++)
	    {
	    	if(traverse[i]!=-1)					//if not visited yet,move ahead from here
	        {
	        	for( int j=i+1; j<=line.length(); j++)   	//upto last point of given string
	        	{
	                String part = line.substring(i, j);  		//consider all substring while increasing char be  char
	                	if(Dictionary.contains(part))
				{       //look-up in dictionary
	                		traverse[j]=i;                   //if found, change visited status
	                        	//i=j;                           //move index pointer ahead
	                	}
	                } 
	        }
	    }
	    return (traverse[line.length()]>-1)                  //if all words found. return true~	
	}
	
	
	public static void main(String arg[])
	{
		Set<String> set = null;
		/*set.add("boy");
		set.add("string");
		set.add("moon");
		set.add("earth");*/
		boolean res=StringSeg.breakable(null,set);
		System.out.println(res);
		
	}
	
	
}
