public class MoveAllxAtTheEnd {
    static void solve(String str,int index,int count,String newString){
        if(index == str.length()){
            for(int i = 0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if(currentChar =='x'){
            count++;
            solve(str,index+1,count,newString);

        }else{
            newString = newString + currentChar;
            solve(str,index+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbxaxxd";
        solve(str,0,0,"");
    }
}
