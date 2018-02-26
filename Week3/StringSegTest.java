import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;


public class StringSegTest {
  @Test
  public void TestBreakable1() {
	  Set<String> set = new HashSet<String>();
		set.add("boy");
		set.add("string");
		set.add("moon");
		set.add("earth");
		
	  assertEquals(StringSeg.breakable("stringstringmoon",set),true);
  }
  
  @Test
  public void TestBreakable2() {
	  Set<String> set = new HashSet<String>();
	  assertEquals(StringSeg.breakable("stringstringmoon",set),false);
  }
  
  @Test
  public void TestBreakable3() {
	  Set<String> set = new HashSet<String>();
		set.add("boy");
		set.add("string");
		set.add("moon");
		set.add("earth");
		
	  assertEquals(StringSeg.breakable("",set),true);
  }
  
  @Test
  public void TestBreakable4() {
	  Set<String> set = null;
		
	  assertEquals(StringSeg.breakable("",set),true);
  }
}

