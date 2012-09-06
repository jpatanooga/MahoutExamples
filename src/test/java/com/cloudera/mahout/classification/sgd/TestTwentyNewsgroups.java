package com.cloudera.mahout.classification.sgd;

import java.io.IOException;

import junit.framework.TestCase;

public class TestTwentyNewsgroups extends TestCase {

  public void testRunTwentyNewsgroups() throws IOException {
    
    TwentyNewsgroups.RunTrainNewsGroups("/Users/jpatterson/Downloads/datasets/20news-bydate/20news-bydate-train/");
    
    
  }
  
}
