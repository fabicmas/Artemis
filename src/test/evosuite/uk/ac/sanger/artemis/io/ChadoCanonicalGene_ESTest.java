/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 11:33:39 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gmod.schema.sequence.FeatureLoc;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.BlastStreamFeature;
import uk.ac.sanger.artemis.io.ChadoCanonicalGene;
import uk.ac.sanger.artemis.io.EmblStreamFeature;
import uk.ac.sanger.artemis.io.Feature;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.io.GenbankStreamFeature;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.MSPcrunchStreamFeature;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ChadoCanonicalGene_ESTest extends ChadoCanonicalGene_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      ChadoCanonicalGene.RangeComparator chadoCanonicalGene_RangeComparator0 = chadoCanonicalGene0.new RangeComparator();
      Range range0 = new Range((-58));
      Range range1 = new Range((-2466), 0);
      int int0 = chadoCanonicalGene_RangeComparator0.compare(range0, range1);
      assertEquals(2408, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      Feature feature0 = chadoCanonicalGene0.getTranscriptFeatureFromName("");
      assertNull(feature0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      BlastStreamFeature blastStreamFeature0 = new BlastStreamFeature(genbankStreamFeature0);
      chadoCanonicalGene0.setGene(blastStreamFeature0);
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getFeatureFromId("W OFYl'+70Ou`Q0f");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.addTranscript((Feature) null);
      List<Feature> list0 = chadoCanonicalGene0.getTranscripts();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.setSrcfeature_id(20);
      int int0 = chadoCanonicalGene0.getSrcfeature_id();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.setSeqlen((-3205));
      int int0 = chadoCanonicalGene0.getSeqlen();
      assertEquals((-3205), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      TreeSet<BlastStreamFeature> treeSet0 = new TreeSet<BlastStreamFeature>();
      HashSet<Feature> hashSet0 = new HashSet<Feature>(treeSet0);
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.updateUniqueName((String) null, (String) null, hashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      chadoCanonicalGene0.addSplicedFeatures(".", (Feature) emblStreamFeature0);
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getTranscriptFeatureFromName(".");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getSplicedFeaturesOfTranscript((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getSpliceTypes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getSpliceSitesOfTranscript((String) null, "pn(");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getQualifier((Feature) null, "paren");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getProteinOfTranscript((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getOtherFeaturesOfTranscript((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      FeatureLoc featureLoc0 = new FeatureLoc();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getNucLocation((Feature) null, featureLoc0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getChildren(emblStreamFeature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.get5UtrOfTranscript((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.get3UtrOfTranscript((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.deleteFeature((Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.autoGenerateTanscriptName("j9C)/%wE7\"JT[dx@y2!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.autoGenerateFeatureName("OoLnf3s'i~y wmJ", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      QualifierVector qualifierVector0 = new QualifierVector();
      MSPcrunchStreamFeature mSPcrunchStreamFeature0 = new MSPcrunchStreamFeature(key0, (Location) null, qualifierVector0);
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.addSplicedFeatures((String) null, (Feature) mSPcrunchStreamFeature0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.addProtein("d6;1cG7A&", (Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.add5PrimeUtr((String) null, (Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(genbankStreamFeature0);
      String string0 = chadoCanonicalGene0.getQualifier(gFFStreamFeature0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      String string0 = chadoCanonicalGene0.getTranscriptFromName("Q9D<3(7Q");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      Feature feature0 = chadoCanonicalGene0.containsTranscript((StringVector) null);
      assertNull(feature0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.addSplicedFeatures("", (Feature) null, false);
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getTranscriptFromName("2(JuQ%8<");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.autoGeneratePepName("q~>6x");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.autoGeneratePepName("http://www.uk.embnet.org/Software/EMBOSS/Apps/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.autoGenerateSplicedFeatureName("+F(gu4o6uEp?3?6:h");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.autoGenerateSplicedFeatureName("uk.ac.sanger.artemis.io.ChadoCanonicalGene");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      boolean boolean0 = chadoCanonicalGene0.isTranscript("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      List<Feature> list0 = chadoCanonicalGene0.getOtherFeaturesOfTranscript("");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      boolean boolean0 = chadoCanonicalGene0.isFirstUtr("/u=X~tMCBE',=", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      List<Feature> list0 = chadoCanonicalGene0.get5UtrOfTranscript("");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      List<Feature> list0 = chadoCanonicalGene0.get3UtrOfTranscript("r^AGtS~}");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      Feature feature0 = chadoCanonicalGene0.getProteinOfTranscript("/u=X~tMCBE',=");
      assertNull(feature0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.addSplicedFeatures("yr]JJ", (Feature) null);
      List<Feature> list0 = chadoCanonicalGene0.getSplicedFeaturesOfTranscript("yr]JJ");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      List<Feature> list0 = chadoCanonicalGene0.getSplicedFeaturesOfTranscript("MIXED");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      Set<String> set0 = chadoCanonicalGene0.getSpliceTypes("");
      assertNull(set0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      List<Feature> list0 = chadoCanonicalGene0.getSpliceSitesOfTranscript("*pSBs", "invalid GFF line: 8 fields needed (got ");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      MSPcrunchStreamFeature mSPcrunchStreamFeature0 = new MSPcrunchStreamFeature(emblStreamFeature0);
      chadoCanonicalGene0.addTranscript(mSPcrunchStreamFeature0);
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getTranscriptFromName("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.addOtherFeatures(")", (Feature) null);
      assertEquals(0, chadoCanonicalGene0.getSeqlen());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.add5PrimeUtr("Component and container locations must contain an equal number of symbols.", (Feature) null);
      assertEquals(0, chadoCanonicalGene0.getSrcfeature_id());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.add3PrimeUtr("r^AGtS~}", (Feature) null);
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.isFirstUtr("", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.correctSpliceSiteAssignments();
      assertEquals(0, chadoCanonicalGene0.getSrcfeature_id());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.addSplicedFeatures("", (Feature) null, false);
      chadoCanonicalGene0.updateUniqueName("", "feature_relationship_rank", (Set<Feature>) null);
      assertEquals(0, chadoCanonicalGene0.getSeqlen());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      TreeSet<Feature> treeSet0 = new TreeSet<Feature>();
      chadoCanonicalGene0.updateUniqueName("", "", treeSet0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.deleteTranscript("r^AGtS~}");
      assertEquals(0, chadoCanonicalGene0.getSrcfeature_id());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.addTranscript((Feature) null);
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.deleteTranscript("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        chadoCanonicalGene0.getGeneUniqueName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      Feature feature0 = chadoCanonicalGene0.getGene();
      assertNull(feature0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      int int0 = chadoCanonicalGene0.getSrcfeature_id();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      List<Feature> list0 = chadoCanonicalGene0.getTranscripts();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      chadoCanonicalGene0.addProtein("", genbankStreamFeature0);
      assertEquals(0, chadoCanonicalGene0.getSrcfeature_id());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      chadoCanonicalGene0.setSeqlen(3117);
      int int0 = chadoCanonicalGene0.getSeqlen();
      assertEquals(3117, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      int int0 = chadoCanonicalGene0.getSeqlen();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      Hashtable<String, List<Feature>> hashtable0 = chadoCanonicalGene0.getSplicedFeatures();
      assertEquals(0, hashtable0.size());
  }
}
