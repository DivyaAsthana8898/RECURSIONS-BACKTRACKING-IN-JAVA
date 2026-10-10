public class SubsequenceUsingRecursion {
    static void solve(String str,int index,String newString){
        if(index == str.length()){
            System.out.println(newString);
            return ;
        }
         char current = str.charAt(index);
        // if want to join;
         solve(str,index+1,newString+current);
         // if not want to join;
        solve(str,index+1,newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        solve(str,0,"");
    }
}
