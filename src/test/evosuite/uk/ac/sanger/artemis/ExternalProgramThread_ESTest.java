/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 19:46:19 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.ExternalProgramThread;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ExternalProgramThread_ESTest extends ExternalProgramThread_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExternalProgramThread externalProgramThread0 = new ExternalProgramThread();
  }
}
