public class CodeWordChecker implements  StringChecker
{
 private int min;
 private int max;
 private String keyWord;

 public CodeWordChecker (int min, int max, String keyWord)
 {
     this.min = min;
     this.max=max;
     this.keyWord= keyWord;
 }
}
