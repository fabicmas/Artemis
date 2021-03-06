/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:54:36 GMT 2018
 */

package org.gmod.schema.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.gmod.schema.general.DbXRef;
import org.gmod.schema.sequence.FeatureCvTerm;
import org.gmod.schema.sequence.FeatureCvTermDbXRef;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FeatureCvTermDbXRef_ESTest extends FeatureCvTermDbXRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FeatureCvTermDbXRef featureCvTermDbXRef0 = new FeatureCvTermDbXRef((DbXRef) null, (FeatureCvTerm) null);
      DbXRef dbXRef0 = featureCvTermDbXRef0.getDbXRef();
      assertNull(dbXRef0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FeatureCvTermDbXRef featureCvTermDbXRef0 = new FeatureCvTermDbXRef();
      FeatureCvTerm featureCvTerm0 = featureCvTermDbXRef0.getFeatureCvTerm();
      assertNull(featureCvTerm0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FeatureCvTermDbXRef featureCvTermDbXRef0 = new FeatureCvTermDbXRef();
      featureCvTermDbXRef0.setFeatureCvTerm((FeatureCvTerm) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FeatureCvTermDbXRef featureCvTermDbXRef0 = new FeatureCvTermDbXRef();
      DbXRef dbXRef0 = mock(DbXRef.class, new ViolatedAssumptionAnswer());
      featureCvTermDbXRef0.setDbXRef(dbXRef0);
  }
}
