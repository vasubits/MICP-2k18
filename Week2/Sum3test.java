package sum3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.DataProvider;

public class testTriplateSum {
  @Test
  public void f() {
	  int ar[]={0, -1,-2,1,2};
	  Set<Set<Integer>> bags=new HashSet<>();
	  Set<Integer> p=new HashSet<>();
	  Set<Integer> p1=new HashSet<>();
	  p.add(-2);
	  p.add(0);
	  p.add(2);
	  bags.add(p);
	  p1.add(-1);
	  p1.add(0);
	  p1.add(1);
	  bags.add(p1);
	  
	  assertEquals(TriplateSum.Sum3(ar),bags);
  }

  @Test
  public void f4() {
	  int ar[]={5,4};
	  
	  assertEquals(TriplateSum.Sum3(ar),null);
  }
  
  @Test
  public void f3() {
	  int ar[]={0,0,0,0,0,0};
	  Set<Set<Integer>> bags=new HashSet<>();
	  Set<Integer> p1=new HashSet<>();
	  p1.add(0);
	  p1.add(0);
	  p1.add(0);
	  bags.add(p1);
	  assertEquals(TriplateSum.Sum3(ar),bags);
  }
  
  
  @Test
  public void f2() {
	  int ar[]={5,4,3,2,1,0,10,12};
	  
	  assertEquals(TriplateSum.Sum3(ar),null);
  }
  
  
  @Test
  public void f1() {
	  int ar[]= {};
	  
	  assertEquals(TriplateSum.Sum3(ar),null);
  }
  
}
