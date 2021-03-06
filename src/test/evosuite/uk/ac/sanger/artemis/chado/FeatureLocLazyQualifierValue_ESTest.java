/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:02:54 GMT 2018
 */

package uk.ac.sanger.artemis.chado;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.util.List;
import java.util.Vector;
import javax.swing.JPasswordField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gmod.schema.sequence.Feature;
import org.gmod.schema.sequence.FeatureProp;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.chado.FeatureLocLazyQualifierValue;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.KeyVector;
import uk.ac.sanger.artemis.util.ByteBuffer;
import uk.ac.sanger.artemis.util.DatabaseDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FeatureLocLazyQualifierValue_ESTest extends FeatureLocLazyQualifierValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Feature feature0 = new Feature();
      FeatureLocLazyQualifierValue featureLocLazyQualifierValue0 = new FeatureLocLazyQualifierValue(feature0, 500);
      featureLocLazyQualifierValue0.setForceLoad(true);
      boolean boolean0 = featureLocLazyQualifierValue0.isForceLoad();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FeatureLocLazyQualifierValue featureLocLazyQualifierValue0 = new FeatureLocLazyQualifierValue((Feature) null, 3066);
      featureLocLazyQualifierValue0.getMatchFeature();
      assertFalse(featureLocLazyQualifierValue0.isLazyLoaded());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Feature feature0 = new Feature();
      feature0.setFeatureId(2);
      FeatureLocLazyQualifierValue featureLocLazyQualifierValue0 = new FeatureLocLazyQualifierValue(feature0, (-3848));
      featureLocLazyQualifierValue0.getMatchFeature();
      assertFalse(featureLocLazyQualifierValue0.isLazyLoaded());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField(0);
      DatabaseDocument databaseDocument0 = new DatabaseDocument("", jPasswordField0);
      // Undeclared exception!
      try { 
        FeatureLocLazyQualifierValue.bulkRetrieve((List) null, databaseDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.chado.FeatureLocLazyQualifierValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      KeyVector keyVector0 = new KeyVector(key0);
      JPasswordField jPasswordField0 = new JPasswordField("");
      DatabaseDocument databaseDocument0 = new DatabaseDocument("", jPasswordField0, "Problems Reading From the Database ", "Problems Reading From the Database ", false);
      // Undeclared exception!
      try { 
        FeatureLocLazyQualifierValue.bulkRetrieve(keyVector0, databaseDocument0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // uk.ac.sanger.artemis.io.Key cannot be cast to uk.ac.sanger.artemis.chado.FeatureLocLazyQualifierValue
         //
         verifyException("uk.ac.sanger.artemis.chado.FeatureLocLazyQualifierValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Feature feature0 = new Feature();
      FeatureLocLazyQualifierValue featureLocLazyQualifierValue0 = new FeatureLocLazyQualifierValue(feature0, (-3848));
      featureLocLazyQualifierValue0.getMatchFeature();
      assertFalse(featureLocLazyQualifierValue0.isLazyLoaded());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FeatureLocLazyQualifierValue featureLocLazyQualifierValue0 = new FeatureLocLazyQualifierValue((Feature) null, 3066);
      boolean boolean0 = featureLocLazyQualifierValue0.isLazyLoaded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FeatureLocLazyQualifierValue featureLocLazyQualifierValue0 = new FeatureLocLazyQualifierValue((Feature) null, 3066);
      featureLocLazyQualifierValue0.isForceLoad();
      assertFalse(featureLocLazyQualifierValue0.isLazyLoaded());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Feature feature0 = new Feature();
      FeatureLocLazyQualifierValue featureLocLazyQualifierValue0 = new FeatureLocLazyQualifierValue(feature0, 500);
      featureLocLazyQualifierValue0.setForceLoad(true);
      // Undeclared exception!
      try { 
        featureLocLazyQualifierValue0.getString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.chado.FeatureLocLazyQualifierValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FeatureLocLazyQualifierValue featureLocLazyQualifierValue0 = new FeatureLocLazyQualifierValue((Feature) null, 3066);
      assertFalse(featureLocLazyQualifierValue0.isForceLoad());
      
      String string0 = featureLocLazyQualifierValue0.getString();
      assertEquals("LAZY LOADING...;", string0);
      assertFalse(featureLocLazyQualifierValue0.isLazyLoaded());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FeatureLocLazyQualifierValue featureLocLazyQualifierValue0 = new FeatureLocLazyQualifierValue((Feature) null, 3066);
      FeatureLocLazyQualifierValue.FeaturePropComparator featureLocLazyQualifierValue_FeaturePropComparator0 = featureLocLazyQualifierValue0.new FeaturePropComparator();
      FeatureProp featureProp0 = new FeatureProp();
      // Undeclared exception!
      try { 
        featureLocLazyQualifierValue_FeaturePropComparator0.compare(featureProp0, "&");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.gmod.schema.sequence.FeatureProp
         //
         verifyException("uk.ac.sanger.artemis.chado.FeatureLocLazyQualifierValue$FeaturePropComparator", e);
      }
  }
}
