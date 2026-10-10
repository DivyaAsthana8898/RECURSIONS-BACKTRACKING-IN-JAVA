public class KeyPadProblemUsingRecursion {
  public   static String []keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
  static  void solve(String str,int index,String combination){
      if(index == str.length()){
          System.out.println(combination);
          return;
      }
      char current = str.charAt(index);
      // taken;
      String mapping = keypad[current-'0'];
      for(int i = 0;i<mapping.length();i++){
          solve(str,index+1,combination+mapping.charAt(i));
      }
  }
    public static void main(String[] args) {
        String str ="5";
        solve(str,0,"");
    }
}
