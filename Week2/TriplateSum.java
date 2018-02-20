package sum3;

import java.util.*;

public class TriplateSum 
{
	public static Set<Set<Integer>> Sum3(int ar[])
	{
		 Set<Set<Integer>> bags = new HashSet<>();
		 int ans[]= {0},n=ar.length,left,right;
		 if(ar == null || ar.length<3) //array is NULL or less than two elements;
			 return null;
		 Arrays.sort(ar); //sorting array
		 for(int i=0;i<n-2;i++) //traversing array for top n-2 elements 
		 {
			 left=i+1; //next bigger element from left
			 right=n-1;// most largest element
		 
		  while(left<right) //till elements indices don't coincide
		  {
			  int sum=ar[i]+ar[left]+ar[right];
			  if(sum==0) // check wheather they are eligible to make ZERO or not ;
			  {
				 // System.out.println("<"+ar[i]+","+ar[left]+","+ar[right]+">");
				  
				  SortedSet<Integer> temp=new TreeSet<>(); //new temp list
				  temp.add(ar[i]);        //add element in list
				  temp.add(ar[left]);
				  temp.add(ar[right]);
				  left++;
				  right--;
				
				  if(!bags.contains(temp)) //uniqueness test
				  {
					  bags.add(temp);     //add triplet into it
				  }
				 
				
				  
			  }
			  else if(sum<0) //if sum less than zero then we need larger elements for sum=0 
			  {
				  left++;   //so move towards left
			  }	  
			  else
			  {
				  right--; //else move towards right
				  
			  }		  
			 
		   }
		
	   }
		 if(!bags.isEmpty())
			 return bags;
		 else		 
			 return null;
	}
	
	/*public static void main(String arg[])
	{
		
		int arr[] = {0, -1,-2,1,2};
	    
		Set<Set<Integer>> bags=new HashSet<>();
		bags=Sum3(arr);
		System.out.println(bags);
		if(bags==null)
			System.out.println("No triplet Found :(");
		else
		{
			for (Set<Integer> l:bags)
			{ 
				System.out.println(Arrays.toString(l.toArray()));
			}
		}
	}*/
}



