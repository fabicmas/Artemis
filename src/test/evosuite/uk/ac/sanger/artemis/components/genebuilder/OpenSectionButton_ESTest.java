/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 22:08:22 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JComponent;
import javax.swing.JList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.genebuilder.OpenSectionButton;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class OpenSectionButton_ESTest extends OpenSectionButton_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OpenSectionButton openSectionButton0 = new OpenSectionButton("", (JComponent) null);
      // Undeclared exception!
      try { 
        openSectionButton0.setOpen(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.OpenSectionButton", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JList<String> jList0 = new JList<String>();
      OpenSectionButton openSectionButton0 = new OpenSectionButton("", jList0);
      openSectionButton0.setOpen(true);
      openSectionButton0.setOpen(true);
      assertFalse(openSectionButton0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JList<String> jList0 = new JList<String>();
      OpenSectionButton openSectionButton0 = new OpenSectionButton("", jList0);
      openSectionButton0.setOpen(false);
      assertTrue(openSectionButton0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JList<String> jList0 = new JList<String>();
      OpenSectionButton openSectionButton0 = new OpenSectionButton("", jList0);
      openSectionButton0.setOpen(true);
      openSectionButton0.doClick(0);
      openSectionButton0.setOpen(false);
      assertFalse(openSectionButton0.isFocusCycleRoot());
  }
}
