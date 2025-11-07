package problems;
/*
    this class helps to reverse given string
    by using it length
 */
public class ReverseString {
    private String word;
    public ReverseString(String word){
        this.word=word;
    }
    public String reverse(){
        String reverse="";
        int length=word.length();
        for(int i=0;i<length;i++){
            reverse+=word.charAt(length-1-i);
        }
        return reverse;
    }
}
