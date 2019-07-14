public class strStr {

    public int strStr(String haystack,String needle){
        return haystack.indexOf(needle);
    }

    public static void main(String[] args){
        System.out.println(new strStr().strStr("hello",""));
    }
}
