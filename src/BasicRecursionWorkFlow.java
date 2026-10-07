public class BasicRecursionWorkFlow {
    static void solve(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
        solve(n-1);
    }

    public static void main(String[] args) {
        solve(5);
    }
}
