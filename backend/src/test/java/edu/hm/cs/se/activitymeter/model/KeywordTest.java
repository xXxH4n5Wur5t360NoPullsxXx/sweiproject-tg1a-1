package edu.hm.cs.se.activitymeter.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class KeywordTest {

  @Test
  public void getContent() throws Exception {
    Keyword keyword = new Keyword("test");
    assertEquals("test", keyword.getContent());
    assertNotNull(new Keyword());
  }

}