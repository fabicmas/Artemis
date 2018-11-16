/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:15:35 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder.ortholog;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.text.Document;
import javax.swing.text.Element;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.genebuilder.ortholog.SimilarityTable;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.util.ByteBuffer;
import uk.ac.sanger.artemis.util.DatabaseDocument;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class SimilarityTable_ESTest extends SimilarityTable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringVector stringVector0 = StringVector.getStrings("Details");
      Qualifier qualifier0 = new Qualifier("Details", stringVector0);
      Document document0 = mock(Document.class, new ViolatedAssumptionAnswer());
      doReturn((Element) null).when(document0).getDefaultRootElement();
      doReturn(0, 0).when(document0).getLength();
      doReturn((Object) null).when(document0).getProperty(any());
      JPasswordField jPasswordField0 = new JPasswordField(document0, "Details", 2530);
      DatabaseDocument databaseDocument0 = new DatabaseDocument("S-ebw3o2A0O}D]", jPasswordField0, "=/PHKeC*l", "Details");
      SimilarityTable similarityTable0 = new SimilarityTable(qualifier0, databaseDocument0);
      // Undeclared exception!
      try { 
        similarityTable0.updateQualifierString(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier();
      JPasswordField jPasswordField0 = new JPasswordField(" ) ", 125);
      DatabaseDocument databaseDocument0 = new DatabaseDocument("", jPasswordField0);
      SimilarityTable similarityTable0 = null;
      try {
        similarityTable0 = new SimilarityTable(qualifier0, databaseDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.ortholog.SimilarityTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier();
      qualifier0.addValue("");
      JPasswordField jPasswordField0 = new JPasswordField("the rsID %s for the record at position %s:%d is not in dbSNP", 13);
      DatabaseDocument databaseDocument0 = new DatabaseDocument("the rsID %s for the record at position %s:%d is not in dbSNP", jPasswordField0, "sfZOP@]a6eq|(i;@", "", true);
      SimilarityTable similarityTable0 = null;
      try {
        similarityTable0 = new SimilarityTable(qualifier0, databaseDocument0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "]e/;:t&r";
      StringVector stringVector0 = new StringVector(stringArray0);
      // Undeclared exception!
      try { 
        SimilarityTable.containsStringInStringVector("]e/;:t&r", stringVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 2
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringVector stringVector0 = new StringVector();
      boolean boolean0 = SimilarityTable.containsStringInStringVector("", stringVector0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[7];
      StringVector stringVector0 = new StringVector(stringArray0);
      // Undeclared exception!
      try { 
        SimilarityTable.containsStringInStringVector("]e/;:t&r", stringVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.StringVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier(":N'`>S&mp]E2spL", "]e/;:t&r\"");
      SimilarityTable similarityTable0 = new SimilarityTable(qualifier0, (DatabaseDocument) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("", "length ");
      JPasswordField jPasswordField0 = new JPasswordField();
      DatabaseDocument databaseDocument0 = new DatabaseDocument("query ", jPasswordField0);
      SimilarityTable similarityTable0 = new SimilarityTable(qualifier0, databaseDocument0);
      JButton jButton0 = similarityTable0.getInfoLevelButton();
      assertFalse(jButton0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("'", "\"Ax6W(PtB;/7h@JxH,");
      JPasswordField jPasswordField0 = new JPasswordField(4);
      DatabaseDocument databaseDocument0 = new DatabaseDocument("\"Ax6W(PtB;/7h@JxH,", jPasswordField0, "'", "uk.ac.sanger.artemis.components.genebuilder.ortholog.SimilarityTable$2", (ByteBuffer) null, "uk.ac.sanger.artemis.components.genebuilder.ortholog.SimilarityTable$2");
      SimilarityTable similarityTable0 = new SimilarityTable(qualifier0, databaseDocument0);
      // Undeclared exception!
      try { 
        similarityTable0.updateQualifierString(4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }
}