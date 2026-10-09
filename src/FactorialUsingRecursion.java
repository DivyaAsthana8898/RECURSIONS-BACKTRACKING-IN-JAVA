public class FactorialUsingRecursion {
   static  int solve(int n){
    if(n == 1 || n== 0){
        return 1;
    }
    int fact = solve(n-1);
    int factAns = n*fact;
    return factAns;
   }
    public static void main(String[] args) {
        int n = 5;
        int ans = solve(n);
        System.out.println(ans);
    }
}
