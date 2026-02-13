public class StringContainsVowel {
    public static void main(String[] args) {
        String str="bye";
        System.out.println(stringContainsVowel(str));
    }
    public static boolean stringContainsVowel(String str){
        if(str==null) throw new IllegalArgumentException("Null is not valid String");
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
