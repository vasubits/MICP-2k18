import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Substringtest {
  LongestSubString s=new LongestSubString();
  @Test
  public void testsubString() {
    String input="aCcBabbcaa";//case sensitive
   	
     // assertEquals(actual, expected)
     assertEquals(4,s.subString("aCcBabbcaa"));
  } 
  
  @Test
  public void testsubString1() {
    String input="i am"; //Space 
   	
     // assertEquals(actual, expected)
     assertEquals(0,s.subString("i am"));
  }
  
  @Test
  public void testsubString2() {
    String input="a@b#aabb";//special Character 
   	
     // assertEquals(actual, expected)
     assertEquals(4,s.subString("a@b#aabb"));
  }
  
  @Test
  public void testsubString3() {
    String input="abcabcaacc";//normal  
   	
     // assertEquals(actual, expected)
     assertEquals(3,s.subString("abcabcaacc"));
  }
  
  @Test
  public void testsubString4() {
    String input="";//empty string 
   	
     // assertEquals(actual, expected)
     assertEquals(0,s.subString(""));
  }
  
  @Test
  public void testsubString5() {
    String input="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";//single Character 
   	
     // assertEquals(actual, expected)
     assertEquals(1,s.subString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  
  
  
  
  
  
}
