public class RemoveDuplicatesUsingRecursions {
    public  static  boolean map[] = new boolean[26];
       static  void solve(String str,int index,String newString){
           if(index == str.length()){
               System.out.println(newString);
               return;

           }
           char current = str.charAt(index);

           if(map[current-'a'] ){
               solve(str,index+1,newString);
           }
           else{
               newString += current;
               map[current - 'a'] = true;
               solve(str,index+1,newString);
           }
       }
    public static void main(String[] args) {
        String str = "abbbcda";
        solve(str, 0, "");
    }
}

