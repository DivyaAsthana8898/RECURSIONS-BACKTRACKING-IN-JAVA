import java.util.HashSet;
import java.util.Set;

public class UniqueSubsiquenceUsingRecursion {
    static  void solve(String str,int index,String newString,HashSet<String> set){
        if(index == str.length()){
           if(set.contains(newString)){
               return;
            } else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char current = str.charAt(index);
        //
        solve(str,index+1,newString+current,set);

        //
        solve(str,index+1,newString,set);

    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        solve(str,0,"",set);
    }
}
