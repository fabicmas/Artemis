/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 22:19:03 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.Key;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Key_ESTest extends Key_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Key key0 = new Key((String) null);
      String string0 = key0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Key key0 = new Key("", false);
      String string0 = key0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Key key0 = new Key("");
      int int0 = key0.length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Key key0 = Key.CDS;
      String string0 = key0.getKeyString();
      assertEquals("CDS", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Key key0 = new Key("", false);
      String string0 = key0.getKeyString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Key key0 = Key.CDS;
      Key key1 = new Key("Ap`,@>jja1AUcv", false);
      int int0 = key0.compareTo(key1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Key key0 = new Key("", true);
      Key key1 = Key.CDS;
      int int0 = key0.compareTo(key1);
      assertEquals((-3), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Key key0 = new Key((String) null, true);
      // Undeclared exception!
      try { 
        key0.length();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Key", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Key key0 = new Key((String) null, true);
      // Undeclared exception!
      try { 
        key0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Key", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Key key0 = new Key((String) null, false);
      // Undeclared exception!
      try { 
        key0.equals(key0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Key key0 = new Key((String) null);
      // Undeclared exception!
      try { 
        key0.compareTo(key0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Key", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Key key0 = new Key("F");
      boolean boolean0 = key0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Key key0 = new Key("x+Y5VkBTE]cMB9xbW", true);
      boolean boolean0 = key0.equals("x+Y5VkBTE]cMB9xbW");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Key key0 = new Key("x+Y5VkBTE]cMB9xbW", true);
      int int0 = key0.compareTo(key0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Key key0 = new Key("F");
      key0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Key key0 = new Key("x+Y5VkBTE]cMB9xbW", true);
      int int0 = key0.length();
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Key key0 = new Key((String) null);
      String string0 = key0.getKeyString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Key key0 = new Key("x+Y5VkBTE]cMB9xbW", true);
      String string0 = key0.toString();
      assertEquals("x+Y5VkBTE]cMB9xbW", string0);
  }
}
