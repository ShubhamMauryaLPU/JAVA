// Input: "abc"
// Output: ["abc", "acb", "bac", "bca", "cab", "cba"]

public class Ques27 {

    public static String comb(String str) {
        StringBuffer st=new StringBuffer("");
        for(int i=0;i<str.length();i++){
            st.append(" ");
            st.append(str.charAt(i));
            for(int j=i+1;j<str.length();j++){
                st.append(str.charAt(j));
            }
        }
        return st.toString();
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(comb(str));
    }
}
