public class PrintingAllSubsequenceUsingBacktracking {
    static  void  solve(String str,String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i =0;i<str.length();i++){
            char current = str.charAt(i);
            String newStr = str.substring(0,i)+ str.substring(i+1);

            StringBuilder sb = new StringBuilder(perm);
            sb.append(current);
             // RECURSIVE CALL
            solve(newStr,sb.toString());
            //BACKTRACKING
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args) {
        solve("abc","");
    }
}
