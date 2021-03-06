/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:21:13 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.io.PipedReader;
import org.biojava.bio.symbol.SymbolList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.FeatureKeyQualifierPredicate;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.io.BioJavaSequence;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RawStreamSequence;
import uk.ac.sanger.artemis.io.StreamSequence;
import uk.ac.sanger.artemis.plot.AGWindowAlgorithm;
import uk.ac.sanger.artemis.plot.MRIAlgorithm;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.Strand;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class MRIAlgorithm_ESTest extends MRIAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "";
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(emblStreamSequence0);
      Bases bases0 = new Bases(rawStreamSequence0);
      Entry entry0 = Entry.newEntry(bases0);
      Bases bases1 = entry0.getBases();
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn(bases1).when(strand0).getBases();
      doReturn(false, true).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) (-5);
      floatArray0[1] = (float) 2;
      // Undeclared exception!
      try { 
        mRIAlgorithm0.getValues(1, 3, floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("uk.ac.sanger.artemis.plot.MRIAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("Assertion Failure: Should have a legal symbol: ");
      StreamSequence streamSequence0 = emblStreamSequence0.copy();
      Bases bases0 = new Bases(streamSequence0);
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn(bases0).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      float[] floatArray0 = new float[9];
      floatArray0[0] = (float) 0;
      floatArray0[1] = (float) 1503;
      floatArray0[2] = (float) 1;
      floatArray0[3] = (float) 2;
      floatArray0[4] = (float) 2;
      floatArray0[5] = (float) 2;
      floatArray0[7] = (float) 5;
      floatArray0[8] = (float) 0;
      // Undeclared exception!
      try { 
        mRIAlgorithm0.getValues(1503, 1, floatArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unexpected exception: org.evosuite.runtime.mock.java.lang.MockThrowable: start: 46 > end: -1455
         //
         verifyException("uk.ac.sanger.artemis.plot.MRIAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      AGWindowAlgorithm aGWindowAlgorithm0 = new AGWindowAlgorithm(strand0);
      Strand strand1 = aGWindowAlgorithm0.getStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand1);
      Bases bases1 = mRIAlgorithm0.getBases();
      Strand strand2 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn(bases1).when(strand2).getBases();
      doReturn(true, true).when(strand2).isForwardStrand();
      MRIAlgorithm mRIAlgorithm1 = new MRIAlgorithm(strand2);
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) 1;
      floatArray0[1] = (float) (-1195);
      // Undeclared exception!
      try { 
        mRIAlgorithm1.getValues(1252, (-1195), floatArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unexpected exception: org.evosuite.runtime.mock.java.lang.MockThrowable: start: 1252 > end: -1194
         //
         verifyException("uk.ac.sanger.artemis.plot.MRIAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("Assertion Failure: Should have a legal symbol: ");
      StreamSequence streamSequence0 = emblStreamSequence0.copy();
      Bases bases0 = new Bases(streamSequence0);
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn(bases0).when(strand0).getBases();
      doReturn(false, true).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      float[] floatArray0 = new float[9];
      floatArray0[0] = (float) 0;
      floatArray0[1] = (float) 1503;
      floatArray0[2] = (float) 1;
      floatArray0[3] = (float) 2;
      floatArray0[4] = (float) 2;
      floatArray0[5] = (float) 2;
      floatArray0[6] = (float) 1;
      floatArray0[7] = (float) 5;
      floatArray0[8] = (float) 0;
      mRIAlgorithm0.getValues(1503, 2789, floatArray0);
      mRIAlgorithm0.getDefaultWindowSize();
      mRIAlgorithm0.getMinimum();
      mRIAlgorithm0.getAverage();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("3<xYGMQ\" T5!?8", "uk.ac.sanger.artemis.io.GFFEntryInformation");
      Bases bases0 = new Bases(fastaStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Range range0 = new Range(0);
      EntryGroup entryGroup0 = simpleEntryGroup0.truncate(range0);
      Key key0 = Key.CDS;
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "cannot recognise format of binary file", "cannot recognise format of binary file", true, false);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(entryGroup0, featureKeyQualifierPredicate0, "/5");
      FeatureVector featureVector0 = filteredEntryGroup0.getFeaturesInRange(range0);
      FilteredEntryGroup filteredEntryGroup1 = new FilteredEntryGroup(entryGroup0, featureVector0, "3<xYGMQ\" T5!?8");
      Entry entry0 = filteredEntryGroup1.createEntry();
      Bases bases1 = entry0.getBases();
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn(bases1).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      mRIAlgorithm0.setUserMax((-1814.088F));
      mRIAlgorithm0.getDefaultMaxWindowSize();
      float[] floatArray0 = new float[8];
      floatArray0[0] = (float) 2;
      floatArray0[1] = (float) 2;
      floatArray0[2] = (float) 1;
      floatArray0[3] = (float) 3068;
      floatArray0[4] = (float) 3068;
      floatArray0[5] = (float) 3068;
      floatArray0[6] = (float) 3068;
      floatArray0[7] = (float) 2;
      // Undeclared exception!
      try { 
        mRIAlgorithm0.getValues(3068, 1, floatArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unexpected exception: org.evosuite.runtime.mock.java.lang.MockThrowable: start: 1 > end: -3066
         //
         verifyException("uk.ac.sanger.artemis.plot.MRIAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader(197);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(pipedReader0);
      FastaStreamSequence fastaStreamSequence0 = null;
      try {
        fastaStreamSequence0 = new FastaStreamSequence(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(true, true).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      mRIAlgorithm0.getDefaultMaxWindowSize();
      mRIAlgorithm0.getDefaultMaxWindowSize();
      mRIAlgorithm0.setUserMax(2);
      mRIAlgorithm0.getAverage();
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      mRIAlgorithm0.getMaximumInternal();
      Color[] colorArray0 = new Color[6];
      Color color0 = mock(Color.class, new ViolatedAssumptionAnswer());
      colorArray0[0] = color0;
      colorArray0[1] = color0;
      colorArray0[2] = color0;
      colorArray0[3] = color0;
      mRIAlgorithm0.getMaximum();
      colorArray0[4] = color0;
      mRIAlgorithm0.setScalingFlag(true);
      colorArray0[5] = color0;
      mRIAlgorithm0.drawLegend(graphics0, 2, 2221, colorArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MRIAlgorithm mRIAlgorithm0 = null;
      try {
        mRIAlgorithm0 = new MRIAlgorithm((Strand) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.MRIAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      mRIAlgorithm0.getDefaultMinWindowSize();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      mRIAlgorithm0.getMaximum();
      mRIAlgorithm0.getMinimum();
      mRIAlgorithm0.setUserMax(2);
      mRIAlgorithm0.getMinimumInternal();
      mRIAlgorithm0.getAverage();
      mRIAlgorithm0.getValueCount();
      mRIAlgorithm0.getDefaultStepSize(10);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      int int0 = 0;
      int int1 = (-761);
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) 0;
      floatArray0[1] = (float) 2;
      floatArray0[2] = (float) (-761);
      floatArray0[3] = (float) 1;
      floatArray0[4] = (float) 0;
      floatArray0[5] = (float) 1;
      floatArray0[6] = (float) 2;
      // Undeclared exception!
      try { 
        mRIAlgorithm0.getValues(0, (-761), floatArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.BaseAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BioJavaSequence bioJavaSequence0 = new BioJavaSequence((SymbolList) null);
      Bases bases0 = new Bases(bioJavaSequence0);
      Strand strand0 = bases0.getForwardStrand();
      AGWindowAlgorithm aGWindowAlgorithm0 = new AGWindowAlgorithm(strand0);
      Strand strand1 = aGWindowAlgorithm0.getStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand1);
      mRIAlgorithm0.getDefaultWindowSize();
      mRIAlgorithm0.getMinimumInternal();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("Assertion Failure: Should have a legal symbol: ");
      StreamSequence streamSequence0 = emblStreamSequence0.copy();
      Bases bases0 = new Bases(streamSequence0);
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn(bases0).when(strand0).getBases();
      doReturn(false, true).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      float[] floatArray0 = new float[9];
      floatArray0[0] = (float) 0;
      floatArray0[1] = (float) 1503;
      floatArray0[2] = (float) 1;
      floatArray0[3] = (float) 2;
      floatArray0[4] = (float) 2;
      floatArray0[5] = (float) 2;
      floatArray0[6] = (float) 1;
      floatArray0[7] = (float) 5;
      floatArray0[8] = (float) 0;
      mRIAlgorithm0.getValues(1503, 2789, floatArray0);
      mRIAlgorithm0.getDefaultWindowSize();
      mRIAlgorithm0.getAverage();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      mRIAlgorithm0.getMaximumInternal();
      mRIAlgorithm0.getMaximumInternal();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      mRIAlgorithm0.getDefaultWindowSize();
      mRIAlgorithm0.getDefaultMinWindowSize();
      mRIAlgorithm0.setUserMax(3966.48F);
      mRIAlgorithm0.getMaximumInternal();
      mRIAlgorithm0.getDefaultStepSize(1797);
      mRIAlgorithm0.getDefaultWindowSize();
      mRIAlgorithm0.getDefaultMinWindowSize();
      mRIAlgorithm0.getDefaultMaxWindowSize();
      mRIAlgorithm0.getMinimumInternal();
      mRIAlgorithm0.getMinimumInternal();
      mRIAlgorithm0.getMinimumInternal();
      mRIAlgorithm0.getMaximumInternal();
      mRIAlgorithm0.getAverage();
      mRIAlgorithm0.getDefaultMaxWindowSize();
      mRIAlgorithm0.getMaximumInternal();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      mRIAlgorithm0.max_min_disabled = false;
      mRIAlgorithm0.getDefaultMinWindowSize();
      mRIAlgorithm0.getMaximum();
      mRIAlgorithm0.getMinimumInternal();
      mRIAlgorithm0.getAverage();
      mRIAlgorithm0.getDefaultStepSize(2);
      mRIAlgorithm0.getDefaultWindowSize();
      mRIAlgorithm0.getDefaultMaxWindowSize();
      mRIAlgorithm0.getValueCount();
      mRIAlgorithm0.getDefaultWindowSize();
      mRIAlgorithm0.getAverage();
      mRIAlgorithm0.getDefaultWindowSize();
      mRIAlgorithm0.getMinimumInternal();
      mRIAlgorithm0.max_min_disabled = true;
      mRIAlgorithm0.getDefaultStepSize((-889));
      mRIAlgorithm0.getMinimumInternal();
      mRIAlgorithm0.getDefaultWindowSize();
      Color[] colorArray0 = new Color[7];
      Color color0 = mock(Color.class, new ViolatedAssumptionAnswer());
      colorArray0[0] = color0;
      colorArray0[1] = color0;
      colorArray0[2] = color0;
      colorArray0[3] = color0;
      colorArray0[4] = color0;
      colorArray0[5] = color0;
      colorArray0[6] = color0;
      mRIAlgorithm0.drawLegend((Graphics) null, (-889), 0, colorArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) 1;
      floatArray0[1] = (float) (-1195);
      // Undeclared exception!
      try { 
        mRIAlgorithm0.getValues(1252, (-1195), floatArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.BaseAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Strand strand0 = mock(Strand.class, new ViolatedAssumptionAnswer());
      doReturn((Bases) null).when(strand0).getBases();
      doReturn(false, false).when(strand0).isForwardStrand();
      MRIAlgorithm mRIAlgorithm0 = new MRIAlgorithm(strand0);
      mRIAlgorithm0.getDefaultMaxWindowSize();
      mRIAlgorithm0.getDefaultStepSize(1);
      mRIAlgorithm0.getDefaultWindowSize();
  }
}
