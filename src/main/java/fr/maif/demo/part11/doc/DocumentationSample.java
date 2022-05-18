package fr.maif.demo.part11.doc;

// Voir aussi le pom.xml pour la configuration du plugin
public class DocumentationSample {
  /**
   * Add given to integers
   * {@snippet class="fr.maif.demo.part11.doc.DocumentationSampleTest" region="addition"}
   * @param p1 first integer
   * @param p2 second integer
   * @return sum of first and second integers
   */
  public static int addition(int p1, int p2) {
    return p1 + p2;
  }
}
