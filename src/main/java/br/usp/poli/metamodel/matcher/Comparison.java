package br.usp.poli.metamodel.matcher;

import java.util.HashMap;
import java.util.Map;
import org.simmetrics.metrics.StringMetrics;
import br.usp.poli.metamodel.Element;
import edu.cmu.lti.lexical_db.ILexicalDatabase;
import edu.cmu.lti.lexical_db.NictWordNet;
import edu.cmu.lti.ws4j.RelatednessCalculator;
import edu.cmu.lti.ws4j.impl.Lesk;
import edu.cmu.lti.ws4j.util.WS4JConfiguration;

public class Comparison {

  private Element left;

  private Element right;

  private enum ComparisonMethod {
    STR_SIM_COSINE(0.4),
    STR_SIM_LEVENSHTEIN(0.4),
    SEM_DIST_LESK(30.0),
    SEM_SIM_COSINE(0.4),
    SEM_SIM_LEVENSHTEIN(0.4);

    private ComparisonMethod(double threshold) {
      this.threshold = threshold;
    }

    private double threshold;

    public double getThreshold() {
      return threshold;
    }
  }

  private Map<ComparisonMethod, Double> scores;

  public Comparison(Element left, Element right) {
    super();
    this.left = left;
    this.right = right;
    this.scores = new HashMap<ComparisonMethod, Double>();
    // calculateStringSimilarity(left.getName(), right.getName());
    calculateWordNetDistance(left.getName(), right.getName());
    // calculateSemanticSimilarity(left.getSemantics(), right.getSemantics());
  }

  private void calculateStringSimilarity(String word1, String word2) {

    double cosine = StringMetrics.cosineSimilarity().compare(word1, word2);
    put(ComparisonMethod.STR_SIM_COSINE, cosine);

    double levenshtein = StringMetrics.damerauLevenshtein().compare(word1, word2);
    put(ComparisonMethod.STR_SIM_LEVENSHTEIN, levenshtein);
  }

  private void calculateSemanticSimilarity(String word1, String word2) {

    double cosine = StringMetrics.cosineSimilarity().compare(word1, word2);
    put(ComparisonMethod.SEM_SIM_COSINE, cosine);

    double levenshtein = StringMetrics.damerauLevenshtein().compare(word1, word2);
    put(ComparisonMethod.SEM_SIM_LEVENSHTEIN, levenshtein);
  }

  private ILexicalDatabase db = new NictWordNet();
  private RelatednessCalculator[] rcs = {
      // new HirstStOnge(db),
      // new LeacockChodorow(db),
      new Lesk(db),
      // new WuPalmer(db),
      // new Resnik(db),
      // new JiangConrath(db),
      // new Lin(db),
      // new Path(db)
  };

  private void calculateWordNetDistance(String word1, String word2) {
    /*
     * When this flag is true, the similarity calculation will only perform on the most frequent
     * senses of each word; when it is false, similarity calculation will be computed on all sense
     * combination
     */
    WS4JConfiguration.getInstance().setMFS(false);
    // WS4JConfiguration.getInstance().setLeskNormalize(true);

    double s = new Lesk(db).calcRelatednessOfWords(word1, word2);
    put(ComparisonMethod.SEM_DIST_LESK, s);
  }

  private void put(ComparisonMethod method, double score) {
    if (score > method.getThreshold()) {
      scores.put(method, score);
    }
  }

  public void print() {
    if (!scores.isEmpty()) {
      System.out.println(this.toString());
    }
  }

  @Override
  public String toString() {
    return "M1." + left + " x M2." + right + "\n   " + scores;
  }
}
