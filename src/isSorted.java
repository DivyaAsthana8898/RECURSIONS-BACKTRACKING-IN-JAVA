public class isSorted {
    static boolean isSorted(int arr [], int index){
        // base case
        if(index == arr.length-1 ){
            return true ;
        }
        if(arr[index] < arr[index+1]){
            // RECURSION
            return  isSorted(arr,index+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
       int []arr = {10,20,30};
        System.out.println(isSorted(arr,0));
    }
}
