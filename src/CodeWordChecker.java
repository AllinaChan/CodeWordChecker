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
 public CodeWordChecker (String keyWord)
 {
     this.keyWord=keyWord;
     this.min=6;
     this.max=20;
 }

 public boolean isValid(String str)
 {
     boolean isValid=true;

     if(str.length()<=this.max && str.length()>= this.min)
     {
         if (str.indexOf(this.keyWord)>=0)
         {
             isValid=false;
         }
     }else{
         isValid=false;
     }
     return isValid;
 }
}
