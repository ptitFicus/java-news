package fr.maif.demo.part11.doc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DocumentationSampleTest {

  @Test
  public void additionShouldAddParameters() {
    // @start region="addition"
    int result = DocumentationSample.addition(1,2);
    assertEquals(3, result);
    // @end
  }
}
