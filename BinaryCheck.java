/*
    This check if a number is binary or not
    nput: N = 1010
    Output: true
    Explanation: Given number is greater than 1
    and none of its digits is greater than 1.
     Thus, it is a binary number greater than 1.

    Examples: N = 1234
    Output: false
    Explanation: Given number is greater than 1
    but some of its digits { 2, 3, 4} are greater than 1.
     Thus, it is not a binary number.
 */
public class BinaryCheck {
    private int num;

    public BinaryCheck(int num){
        this.num=num;
    }

    public boolean isBinary(){
        if(num ==0 || num ==1 || num<0) return false;
        else{
            while(num!=0){
                if(num%10>1) return false;
                num/=10;
            }
            return true;
        }
    }
    public boolean isBinary_regExp(){
        String regExp="[01][01]+"; //matches one of the following { "00", "01", "10", "11" }.
        return String.valueOf(num).matches(regExp);
    }
}
